# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[13]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-8bd4a8b0-35e3-4aee-a5f5-7a56d61c379a` |
| 2 | `POST /v1/accounts` | 201 | 65 | `qa-9a35a6ab-24c8-40a2-af34-4eb3db7e0063` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-3f078426-849e-481e-99c5-d59a353a39e7` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-c24bf8f7-ded3-4e27-bf34-2a145b982b07` |
| 5 | `POST /v1/conversations/{id}/messages` | 415 | 16 | `qa-8067bb8c-7d1a-48a6-a5d0-a56c4f752ed4` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-65f53f9b-7575-4585-81fa-45bf926a8a9a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-cf39d27a-60c2-456d-95c3-639d6adc2c5e` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-017a7fae-302b-45ec-8d22-ede4ec09141d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-43865fcb-08d9-47b6-8318-0a6e1986210e` |
| 10 | `POST /v1/auth/token` | 401 | 43 | `qa-eb6771b8-ab03-459f-9dae-49bb5b05d253` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8bd4a8b0-35e3-4aee-a5f5-7a56d61c379a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bd4a8b0-35e3-4aee-a5f5-7a56d61c379a
Content-Type: application/json

--- request body ---
{"handle":"qa-a0000a958823","displayName":"QA a0000a958823","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bd4a8b0-35e3-4aee-a5f5-7a56d61c379a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 6
Location: /v1/accounts/qa-a0000a958823
X-Served-Region: eu
Content-Length: 181

{"id":"acc_287e2474-87be-42e6-8dd2-e104ac26cfe7","handle":"qa-a0000a958823","displayName":"QA a0000a958823","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.755157495Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9a35a6ab-24c8-40a2-af34-4eb3db7e0063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a35a6ab-24c8-40a2-af34-4eb3db7e0063
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa72de94504","displayName":"QA bfa72de94504","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a35a6ab-24c8-40a2-af34-4eb3db7e0063
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
Location: /v1/accounts/qa-bfa72de94504
X-Served-Region: eu
Content-Length: 181

{"id":"acc_062c1c8e-15c7-4c2a-94a4-f1d033bfc845","handle":"qa-bfa72de94504","displayName":"QA bfa72de94504","region":"eu","role":"user","createdAt":"2026-10-23T07:41:46.839713894Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f078426-849e-481e-99c5-d59a353a39e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f078426-849e-481e-99c5-d59a353a39e7
Content-Type: application/json

--- request body ---
{"handle":"qa-a0000a958823","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f078426-849e-481e-99c5-d59a353a39e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_287e2474-87be-42e6-8dd2-e104ac26cfe7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c24bf8f7-ded3-4e27-bf34-2a145b982b07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c24bf8f7-ded3-4e27-bf34-2a145b982b07
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bfa72de94504","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c24bf8f7-ded3-4e27-bf34-2a145b982b07
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
Location: /v1/conversations/cnv_2ae42f2e-d391-4d8a-a8fe-5cfd55daec6a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2ae42f2e-d391-4d8a-a8fe-5cfd55daec6a","subject":"Error contract","status":"open","region":"eu","participants":["qa-a0000a958823","qa-bfa72de94504"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:46.945374468Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_2ae42f2e-d391-4d8a-a8fe-5cfd55daec6a/messages
correlation: qa-8067bb8c-7d1a-48a6-a5d0-a56c4f752ed4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8067bb8c-7d1a-48a6-a5d0-a56c4f752ed4
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Fri, 23 Oct 2026 07:41:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8067bb8c-7d1a-48a6-a5d0-a56c4f752ed4
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
Content-Length: 307

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations/cnv_2ae42f2e-d391-4d8a-a8fe-5cfd55daec6a/messages","correlationId":"qa-8067bb8c-7d1a-48a6-a5d0-a56c4f752ed4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-65f53f9b-7575-4585-81fa-45bf926a8a9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65f53f9b-7575-4585-81fa-45bf926a8a9a
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa72de94504","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-65f53f9b-7575-4585-81fa-45bf926a8a9a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_062c1c8e-15c7-4c2a-94a4-f1d033bfc845"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf39d27a-60c2-456d-95c3-639d6adc2c5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf39d27a-60c2-456d-95c3-639d6adc2c5e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf39d27a-60c2-456d-95c3-639d6adc2c5e
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
correlation: qa-017a7fae-302b-45ec-8d22-ede4ec09141d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-017a7fae-302b-45ec-8d22-ede4ec09141d
Content-Type: application/json

--- request body ---
{"handle":"qa-bfa72de94504","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-017a7fae-302b-45ec-8d22-ede4ec09141d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-017a7fae-302b-45ec-8d22-ede4ec09141d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-43865fcb-08d9-47b6-8318-0a6e1986210e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43865fcb-08d9-47b6-8318-0a6e1986210e
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-43865fcb-08d9-47b6-8318-0a6e1986210e
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
correlation: qa-eb6771b8-ab03-459f-9dae-49bb5b05d253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb6771b8-ab03-459f-9dae-49bb5b05d253
Content-Type: application/json

--- request body ---
{"handle":"qa-a0000a958823","password":"****"}

--- response: 401 in 43 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb6771b8-ab03-459f-9dae-49bb5b05d253
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 315
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb6771b8-ab03-459f-9dae-49bb5b05d253"}
```
