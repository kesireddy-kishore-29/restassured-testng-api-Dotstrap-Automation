# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-d6c7deae-6034-4d94-a3d0-bab951f67e14` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-098a50fa-1b96-4858-8987-51ca8da4d109` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-21906df0-b623-4b05-b46d-3764a62bc8e4` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-8059e051-2457-4835-afad-be10b66937e6` |
| 5 | `POST /v1/conversations` | 422 | 31 | `qa-df5999ac-a047-41ce-80bf-f2d71e247c41` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-b885eabd-ab0c-4bf3-8d04-4a429a654452` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-29693faa-9fb2-4bff-8ba2-56af651933ac` |
| 8 | `POST /v1/auth/token` | 401 | 8 | `qa-b052fb4f-6702-4004-80b1-51a06efdad33` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-ea2d5a3f-8c41-44c7-960e-e06a2996083e` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-ddfb1f5f-4082-4cd5-8553-cf5bb7d7fdb2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d6c7deae-6034-4d94-a3d0-bab951f67e14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6c7deae-6034-4d94-a3d0-bab951f67e14
Content-Type: application/json

--- request body ---
{"handle":"qa-fbbae6691024","displayName":"QA fbbae6691024","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6c7deae-6034-4d94-a3d0-bab951f67e14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 397
RateLimit-Reset: 8
Location: /v1/accounts/qa-fbbae6691024
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19cac52b-1e9a-4233-8cbb-91c55714e3e7","handle":"qa-fbbae6691024","displayName":"QA fbbae6691024","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.960999213Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-098a50fa-1b96-4858-8987-51ca8da4d109

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-098a50fa-1b96-4858-8987-51ca8da4d109
Content-Type: application/json

--- request body ---
{"handle":"qa-bbb460793bf6","displayName":"QA bbb460793bf6","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-098a50fa-1b96-4858-8987-51ca8da4d109
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 393
RateLimit-Reset: 8
Location: /v1/accounts/qa-bbb460793bf6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f74d9664-ddb3-4e98-9398-7207a57a0d67","handle":"qa-bbb460793bf6","displayName":"QA bbb460793bf6","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.002517463Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-21906df0-b623-4b05-b46d-3764a62bc8e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21906df0-b623-4b05-b46d-3764a62bc8e4
Content-Type: application/json

--- request body ---
{"handle":"qa-fbbae6691024","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-21906df0-b623-4b05-b46d-3764a62bc8e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19cac52b-1e9a-4233-8cbb-91c55714e3e7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8059e051-2457-4835-afad-be10b66937e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8059e051-2457-4835-afad-be10b66937e6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bbb460793bf6","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8059e051-2457-4835-afad-be10b66937e6
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
Location: /v1/conversations/cnv_546c9e69-fc2d-428e-879b-caeeabfcb655
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_546c9e69-fc2d-428e-879b-caeeabfcb655","subject":"Error contract","status":"open","region":"eu","participants":["qa-fbbae6691024","qa-bbb460793bf6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.074395791Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-df5999ac-a047-41ce-80bf-f2d71e247c41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df5999ac-a047-41ce-80bf-f2d71e247c41
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-bbb460793bf6","subject":" ","message":"Hi"}

--- response: 422 in 31 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df5999ac-a047-41ce-80bf-f2d71e247c41
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-df5999ac-a047-41ce-80bf-f2d71e247c41","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b885eabd-ab0c-4bf3-8d04-4a429a654452

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b885eabd-ab0c-4bf3-8d04-4a429a654452
Content-Type: application/json

--- request body ---
{"handle":"qa-bbb460793bf6","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b885eabd-ab0c-4bf3-8d04-4a429a654452
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f74d9664-ddb3-4e98-9398-7207a57a0d67"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-29693faa-9fb2-4bff-8ba2-56af651933ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29693faa-9fb2-4bff-8ba2-56af651933ac
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-29693faa-9fb2-4bff-8ba2-56af651933ac
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
correlation: qa-b052fb4f-6702-4004-80b1-51a06efdad33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b052fb4f-6702-4004-80b1-51a06efdad33
Content-Type: application/json

--- request body ---
{"handle":"qa-bbb460793bf6","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b052fb4f-6702-4004-80b1-51a06efdad33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b052fb4f-6702-4004-80b1-51a06efdad33"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea2d5a3f-8c41-44c7-960e-e06a2996083e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea2d5a3f-8c41-44c7-960e-e06a2996083e
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea2d5a3f-8c41-44c7-960e-e06a2996083e
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
correlation: qa-ddfb1f5f-4082-4cd5-8553-cf5bb7d7fdb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddfb1f5f-4082-4cd5-8553-cf5bb7d7fdb2
Content-Type: application/json

--- request body ---
{"handle":"qa-fbbae6691024","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddfb1f5f-4082-4cd5-8553-cf5bb7d7fdb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ddfb1f5f-4082-4cd5-8553-cf5bb7d7fdb2"}
```
