# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 412 | `qa-48e4202f-dede-414f-9df3-41e87e2d49f8` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-3fc0674d-c9ed-4baf-b07e-d7c6429f5b84` |
| 3 | `POST /v1/auth/token` | 200 | 74 | `qa-19ccf447-9582-4f9e-af7d-ef9a98ddb0aa` |
| 4 | `POST /v1/conversations` | 201 | 61 | `qa-b1da1617-d1f5-4685-b969-2b67fbf5060f` |
| 5 | `POST /v1/auth/token` | 422 | 80 | `qa-10348fd4-201d-45f6-a119-2521a34fe98b` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-bcf83a9f-b9b1-4586-9bd0-d6a285aa80e2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-60ee0393-d4a1-4250-bd4b-f75dab57f3ab` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-8960f6ea-39a5-48af-bf0b-a5152a227796` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-c2347c39-04ad-4980-b7cc-0dba31e2db10` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-0597ad74-46d0-4670-a6a2-2c6cc2e84d1d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-48e4202f-dede-414f-9df3-41e87e2d49f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48e4202f-dede-414f-9df3-41e87e2d49f8
Content-Type: application/json

--- request body ---
{"handle":"qa-009593b28bd5","displayName":"QA 009593b28bd5","password":"****","region":"eu"}

--- response: 201 in 412 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-48e4202f-dede-414f-9df3-41e87e2d49f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Location: /v1/accounts/qa-009593b28bd5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a242ce7f-5391-4d63-9354-04d7b456f627","handle":"qa-009593b28bd5","displayName":"QA 009593b28bd5","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.343259085Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3fc0674d-c9ed-4baf-b07e-d7c6429f5b84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fc0674d-c9ed-4baf-b07e-d7c6429f5b84
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb2224a0754","displayName":"QA aeb2224a0754","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3fc0674d-c9ed-4baf-b07e-d7c6429f5b84
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-aeb2224a0754
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c4dd5e34-d469-48d3-9da1-a76e60029997","handle":"qa-aeb2224a0754","displayName":"QA aeb2224a0754","region":"eu","role":"user","createdAt":"2026-11-01T09:23:20.787001105Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-19ccf447-9582-4f9e-af7d-ef9a98ddb0aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19ccf447-9582-4f9e-af7d-ef9a98ddb0aa
Content-Type: application/json

--- request body ---
{"handle":"qa-009593b28bd5","password":"****"}

--- response: 200 in 74 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-19ccf447-9582-4f9e-af7d-ef9a98ddb0aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a242ce7f-5391-4d63-9354-04d7b456f627"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b1da1617-d1f5-4685-b969-2b67fbf5060f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1da1617-d1f5-4685-b969-2b67fbf5060f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aeb2224a0754","subject":"Error contract","message":"Hi"}

--- response: 201 in 61 ms ---
Date: Sun, 01 Nov 2026 09:23:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1da1617-d1f5-4685-b969-2b67fbf5060f
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
Location: /v1/conversations/cnv_c958e6fc-fcfd-426b-9d14-b81a93ff8c2e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c958e6fc-fcfd-426b-9d14-b81a93ff8c2e","subject":"Error contract","status":"open","region":"eu","participants":["qa-009593b28bd5","qa-aeb2224a0754"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:20.998149615Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-10348fd4-201d-45f6-a119-2521a34fe98b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10348fd4-201d-45f6-a119-2521a34fe98b
Content-Type: application/json

--- request body ---
{"handle":"qa-009593b28bd5","password":"****","ttlSeconds":0}

--- response: 422 in 80 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10348fd4-201d-45f6-a119-2521a34fe98b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 10
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-10348fd4-201d-45f6-a119-2521a34fe98b","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bcf83a9f-b9b1-4586-9bd0-d6a285aa80e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcf83a9f-b9b1-4586-9bd0-d6a285aa80e2
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb2224a0754","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcf83a9f-b9b1-4586-9bd0-d6a285aa80e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4dd5e34-d469-48d3-9da1-a76e60029997"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-60ee0393-d4a1-4250-bd4b-f75dab57f3ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60ee0393-d4a1-4250-bd4b-f75dab57f3ab
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-60ee0393-d4a1-4250-bd4b-f75dab57f3ab
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
correlation: qa-8960f6ea-39a5-48af-bf0b-a5152a227796

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8960f6ea-39a5-48af-bf0b-a5152a227796
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb2224a0754","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8960f6ea-39a5-48af-bf0b-a5152a227796
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8960f6ea-39a5-48af-bf0b-a5152a227796"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c2347c39-04ad-4980-b7cc-0dba31e2db10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2347c39-04ad-4980-b7cc-0dba31e2db10
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c2347c39-04ad-4980-b7cc-0dba31e2db10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-0597ad74-46d0-4670-a6a2-2c6cc2e84d1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0597ad74-46d0-4670-a6a2-2c6cc2e84d1d
Content-Type: application/json

--- request body ---
{"handle":"qa-009593b28bd5","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0597ad74-46d0-4670-a6a2-2c6cc2e84d1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0597ad74-46d0-4670-a6a2-2c6cc2e84d1d"}
```
