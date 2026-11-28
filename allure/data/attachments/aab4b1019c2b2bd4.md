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
| 1 | `POST /v1/accounts` | 201 | 32 | `qa-190dfe8e-d5f9-434e-a5ea-b12f2b5772a2` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-c5ef6154-2557-4afe-8d41-3cba957762c3` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-ccfceb8c-82fa-413d-8e3f-05a1e1ff226d` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-eacaa0be-61e5-44fa-a5fe-4035e67e0cbe` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 25 | `qa-9ef6eba3-b680-4625-8dfb-e033538c38fe` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-5faf7533-f3bc-47ba-91d8-e23f660b788b` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-3c80498b-da80-4825-8810-acafbce6d9a6` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-8dd1995a-ebc5-45b7-ae91-cd0560583982` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-550b54cf-f215-40e5-9886-19eddb51e396` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-8e05fc64-8e31-4843-a0bb-5fca7edd2af9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-190dfe8e-d5f9-434e-a5ea-b12f2b5772a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-190dfe8e-d5f9-434e-a5ea-b12f2b5772a2
Content-Type: application/json

--- request body ---
{"handle":"qa-edd75fc3c2bb","displayName":"QA edd75fc3c2bb","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-190dfe8e-d5f9-434e-a5ea-b12f2b5772a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Location: /v1/accounts/qa-edd75fc3c2bb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a2882031-df22-40d9-82b7-6eb3b673e70b","handle":"qa-edd75fc3c2bb","displayName":"QA edd75fc3c2bb","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.422581777Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c5ef6154-2557-4afe-8d41-3cba957762c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5ef6154-2557-4afe-8d41-3cba957762c3
Content-Type: application/json

--- request body ---
{"handle":"qa-98e6e33b28d4","displayName":"QA 98e6e33b28d4","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5ef6154-2557-4afe-8d41-3cba957762c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Location: /v1/accounts/qa-98e6e33b28d4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a19b64d7-2b08-410b-8949-9f6a725920a6","handle":"qa-98e6e33b28d4","displayName":"QA 98e6e33b28d4","region":"eu","role":"user","createdAt":"2026-11-28T10:37:25.461376097Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ccfceb8c-82fa-413d-8e3f-05a1e1ff226d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccfceb8c-82fa-413d-8e3f-05a1e1ff226d
Content-Type: application/json

--- request body ---
{"handle":"qa-edd75fc3c2bb","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccfceb8c-82fa-413d-8e3f-05a1e1ff226d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a2882031-df22-40d9-82b7-6eb3b673e70b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-eacaa0be-61e5-44fa-a5fe-4035e67e0cbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eacaa0be-61e5-44fa-a5fe-4035e67e0cbe
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-98e6e33b28d4","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-eacaa0be-61e5-44fa-a5fe-4035e67e0cbe
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
Location: /v1/conversations/cnv_ad590a9e-6a15-4443-a96a-faba8e37a0c3
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ad590a9e-6a15-4443-a96a-faba8e37a0c3","subject":"Error contract","status":"open","region":"eu","participants":["qa-edd75fc3c2bb","qa-98e6e33b28d4"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:25.524626789Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ad590a9e-6a15-4443-a96a-faba8e37a0c3/messages
correlation: qa-9ef6eba3-b680-4625-8dfb-e033538c38fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ef6eba3-b680-4625-8dfb-e033538c38fe
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ef6eba3-b680-4625-8dfb-e033538c38fe
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_ad590a9e-6a15-4443-a96a-faba8e37a0c3/messages","correlationId":"qa-9ef6eba3-b680-4625-8dfb-e033538c38fe"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5faf7533-f3bc-47ba-91d8-e23f660b788b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5faf7533-f3bc-47ba-91d8-e23f660b788b
Content-Type: application/json

--- request body ---
{"handle":"qa-98e6e33b28d4","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-5faf7533-f3bc-47ba-91d8-e23f660b788b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a19b64d7-2b08-410b-8949-9f6a725920a6"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c80498b-da80-4825-8810-acafbce6d9a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c80498b-da80-4825-8810-acafbce6d9a6
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c80498b-da80-4825-8810-acafbce6d9a6
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
correlation: qa-8dd1995a-ebc5-45b7-ae91-cd0560583982

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dd1995a-ebc5-45b7-ae91-cd0560583982
Content-Type: application/json

--- request body ---
{"handle":"qa-98e6e33b28d4","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8dd1995a-ebc5-45b7-ae91-cd0560583982
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8dd1995a-ebc5-45b7-ae91-cd0560583982"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-550b54cf-f215-40e5-9886-19eddb51e396

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-550b54cf-f215-40e5-9886-19eddb51e396
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-550b54cf-f215-40e5-9886-19eddb51e396
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
correlation: qa-8e05fc64-8e31-4843-a0bb-5fca7edd2af9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e05fc64-8e31-4843-a0bb-5fca7edd2af9
Content-Type: application/json

--- request body ---
{"handle":"qa-edd75fc3c2bb","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e05fc64-8e31-4843-a0bb-5fca7edd2af9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e05fc64-8e31-4843-a0bb-5fca7edd2af9"}
```
