# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-ff299ee4-2433-4714-9ccb-5f541f4f6228` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-460007d0-eccf-49f0-b620-93ae643773d0` |
| 3 | `POST /v1/auth/token` | 200 | 55 | `qa-6b774969-6572-4a63-9393-91df3b1c642a` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-618b123f-8526-4e65-9319-38daeed7a8d2` |
| 5 | `POST /v1/accounts` | 503 | 18 | `qa-577cc6c6-6f9b-450c-9161-f48cc80ce9b4` |
| 6 | `POST /v1/auth/token` | 200 | 57 | `qa-b0166f1d-304b-460b-8da0-137dbfaa2fef` |
| 7 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-b2ec54e4-a0b1-4d30-b65b-3c9a2f6f6f58` |
| 8 | `POST /v1/auth/token` | 401 | 29 | `qa-d6787a1c-d5e0-4d7d-9b60-58dd82ff807b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 48 | `qa-7a13c68f-2d7b-4bff-902c-8d22ed940f32` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-0378d7cd-10ca-4c90-966d-26d9eeb8ba0c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ff299ee4-2433-4714-9ccb-5f541f4f6228

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff299ee4-2433-4714-9ccb-5f541f4f6228
Content-Type: application/json

--- request body ---
{"handle":"qa-6966ea2c7299","displayName":"QA 6966ea2c7299","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff299ee4-2433-4714-9ccb-5f541f4f6228
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Location: /v1/accounts/qa-6966ea2c7299
X-Served-Region: eu
Content-Length: 181

{"id":"acc_17dced0c-e8bb-4970-8162-29e9fb78b122","handle":"qa-6966ea2c7299","displayName":"QA 6966ea2c7299","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.529707535Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-460007d0-eccf-49f0-b620-93ae643773d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-460007d0-eccf-49f0-b620-93ae643773d0
Content-Type: application/json

--- request body ---
{"handle":"qa-1fff3bf4dac5","displayName":"QA 1fff3bf4dac5","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-460007d0-eccf-49f0-b620-93ae643773d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-1fff3bf4dac5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0baabe46-a1e2-4546-9774-b047ad20b7c2","handle":"qa-1fff3bf4dac5","displayName":"QA 1fff3bf4dac5","region":"eu","role":"user","createdAt":"2026-11-19T10:29:23.593668185Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6b774969-6572-4a63-9393-91df3b1c642a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b774969-6572-4a63-9393-91df3b1c642a
Content-Type: application/json

--- request body ---
{"handle":"qa-6966ea2c7299","password":"****"}

--- response: 200 in 55 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b774969-6572-4a63-9393-91df3b1c642a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_17dced0c-e8bb-4970-8162-29e9fb78b122"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-618b123f-8526-4e65-9319-38daeed7a8d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-618b123f-8526-4e65-9319-38daeed7a8d2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1fff3bf4dac5","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-618b123f-8526-4e65-9319-38daeed7a8d2
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
Location: /v1/conversations/cnv_ce917776-63b9-43ae-b241-fe664baaa59a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ce917776-63b9-43ae-b241-fe664baaa59a","subject":"Error contract","status":"open","region":"eu","participants":["qa-6966ea2c7299","qa-1fff3bf4dac5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:23.728130107Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-577cc6c6-6f9b-450c-9161-f48cc80ce9b4

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: eb826fb5-65ce-4b8a-97fb-e5b332a22658
X-Correlation-Id: qa-577cc6c6-6f9b-450c-9161-f48cc80ce9b4
Content-Type: application/json

--- request body ---
{"handle":"qa-569cc0198cae","displayName":"QA 569cc0198cae","password":"****","region":"eu"}

--- response: 503 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-577cc6c6-6f9b-450c-9161-f48cc80ce9b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-577cc6c6-6f9b-450c-9161-f48cc80ce9b4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b0166f1d-304b-460b-8da0-137dbfaa2fef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0166f1d-304b-460b-8da0-137dbfaa2fef
Content-Type: application/json

--- request body ---
{"handle":"qa-1fff3bf4dac5","password":"****"}

--- response: 200 in 57 ms ---
Date: Thu, 19 Nov 2026 10:29:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0166f1d-304b-460b-8da0-137dbfaa2fef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 521
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0baabe46-a1e2-4546-9774-b047ad20b7c2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b2ec54e4-a0b1-4d30-b65b-3c9a2f6f6f58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2ec54e4-a0b1-4d30-b65b-3c9a2f6f6f58
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b2ec54e4-a0b1-4d30-b65b-3c9a2f6f6f58
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
correlation: qa-d6787a1c-d5e0-4d7d-9b60-58dd82ff807b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6787a1c-d5e0-4d7d-9b60-58dd82ff807b
Content-Type: application/json

--- request body ---
{"handle":"qa-1fff3bf4dac5","password":"****"}

--- response: 401 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6787a1c-d5e0-4d7d-9b60-58dd82ff807b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d6787a1c-d5e0-4d7d-9b60-58dd82ff807b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a13c68f-2d7b-4bff-902c-8d22ed940f32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a13c68f-2d7b-4bff-902c-8d22ed940f32
Content-Type: application/json

--- response: 204 in 48 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a13c68f-2d7b-4bff-902c-8d22ed940f32
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
correlation: qa-0378d7cd-10ca-4c90-966d-26d9eeb8ba0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0378d7cd-10ca-4c90-966d-26d9eeb8ba0c
Content-Type: application/json

--- request body ---
{"handle":"qa-6966ea2c7299","password":"****"}

--- response: 401 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0378d7cd-10ca-4c90-966d-26d9eeb8ba0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0378d7cd-10ca-4c90-966d-26d9eeb8ba0c"}
```
