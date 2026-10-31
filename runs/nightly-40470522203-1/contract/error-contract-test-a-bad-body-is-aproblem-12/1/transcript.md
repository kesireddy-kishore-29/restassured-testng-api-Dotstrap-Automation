# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-9e3f5d9d-cede-4a11-bd26-3480a3e393f8` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-3a4cdb7c-eb78-4d9b-9e1c-cd83ff1808ff` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-5c3e2fa1-05a1-40cf-94eb-2b4c4fa48016` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-e5180a90-6794-48de-a7fb-43fc69589279` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 29 | `qa-133bf721-a60c-4ef4-89cc-fbb543073311` |
| 6 | `POST /v1/auth/token` | 200 | 24 | `qa-cce956d2-7a9d-416c-9afc-d2bf3e141982` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-ff408975-3d7a-474c-9774-b2d0e3a96dc2` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-a9caa287-a0c7-4cdb-a6b4-f449b2e3debd` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ba6a176a-3d81-40b1-8bde-51666ce45799` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-98d04fe1-45d6-4373-8a44-152e20cf4054` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e3f5d9d-cede-4a11-bd26-3480a3e393f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e3f5d9d-cede-4a11-bd26-3480a3e393f8
Content-Type: application/json

--- request body ---
{"handle":"qa-aa5552f91311","displayName":"QA aa5552f91311","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e3f5d9d-cede-4a11-bd26-3480a3e393f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 6
Location: /v1/accounts/qa-aa5552f91311
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed36fccf-7af0-4ccb-979c-3055d6134ad4","handle":"qa-aa5552f91311","displayName":"QA aa5552f91311","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.359204852Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a4cdb7c-eb78-4d9b-9e1c-cd83ff1808ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a4cdb7c-eb78-4d9b-9e1c-cd83ff1808ff
Content-Type: application/json

--- request body ---
{"handle":"qa-ff2679049a8d","displayName":"QA ff2679049a8d","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a4cdb7c-eb78-4d9b-9e1c-cd83ff1808ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 346
RateLimit-Reset: 6
Location: /v1/accounts/qa-ff2679049a8d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d93789a-3bec-4e10-85d3-152e7a382fcc","handle":"qa-ff2679049a8d","displayName":"QA ff2679049a8d","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.404793644Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5c3e2fa1-05a1-40cf-94eb-2b4c4fa48016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c3e2fa1-05a1-40cf-94eb-2b4c4fa48016
Content-Type: application/json

--- request body ---
{"handle":"qa-aa5552f91311","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c3e2fa1-05a1-40cf-94eb-2b4c4fa48016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed36fccf-7af0-4ccb-979c-3055d6134ad4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e5180a90-6794-48de-a7fb-43fc69589279

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5180a90-6794-48de-a7fb-43fc69589279
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ff2679049a8d","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5180a90-6794-48de-a7fb-43fc69589279
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_6d9420bb-c76a-4556-8557-0ddeee6c68cd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6d9420bb-c76a-4556-8557-0ddeee6c68cd","subject":"Error contract","status":"open","region":"eu","participants":["qa-aa5552f91311","qa-ff2679049a8d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.461362401Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_6d9420bb-c76a-4556-8557-0ddeee6c68cd/messages
correlation: qa-133bf721-a60c-4ef4-89cc-fbb543073311

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-133bf721-a60c-4ef4-89cc-fbb543073311
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-133bf721-a60c-4ef4-89cc-fbb543073311
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_6d9420bb-c76a-4556-8557-0ddeee6c68cd/messages","correlationId":"qa-133bf721-a60c-4ef4-89cc-fbb543073311"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cce956d2-7a9d-416c-9afc-d2bf3e141982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cce956d2-7a9d-416c-9afc-d2bf3e141982
Content-Type: application/json

--- request body ---
{"handle":"qa-ff2679049a8d","password":"****"}

--- response: 200 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-cce956d2-7a9d-416c-9afc-d2bf3e141982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d93789a-3bec-4e10-85d3-152e7a382fcc"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff408975-3d7a-474c-9774-b2d0e3a96dc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff408975-3d7a-474c-9774-b2d0e3a96dc2
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ff408975-3d7a-474c-9774-b2d0e3a96dc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-a9caa287-a0c7-4cdb-a6b4-f449b2e3debd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9caa287-a0c7-4cdb-a6b4-f449b2e3debd
Content-Type: application/json

--- request body ---
{"handle":"qa-ff2679049a8d","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9caa287-a0c7-4cdb-a6b4-f449b2e3debd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9caa287-a0c7-4cdb-a6b4-f449b2e3debd"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba6a176a-3d81-40b1-8bde-51666ce45799

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba6a176a-3d81-40b1-8bde-51666ce45799
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba6a176a-3d81-40b1-8bde-51666ce45799
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-98d04fe1-45d6-4373-8a44-152e20cf4054

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98d04fe1-45d6-4373-8a44-152e20cf4054
Content-Type: application/json

--- request body ---
{"handle":"qa-aa5552f91311","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98d04fe1-45d6-4373-8a44-152e20cf4054
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98d04fe1-45d6-4373-8a44-152e20cf4054"}
```
