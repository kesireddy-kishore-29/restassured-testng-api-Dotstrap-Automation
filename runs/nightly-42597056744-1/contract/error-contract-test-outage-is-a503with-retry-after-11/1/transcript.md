# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 7 | `qa-67e8d25d-b2b4-43b2-8a2d-65dd00296fa1` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-42730a11-bb92-4ced-96af-be453be0b3a2` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-b9f0cb8e-8d79-47e8-8461-ae5cc83cd057` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-1c3dbf42-f74d-4df6-9a6a-ec92dd862ffa` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 20 | `qa-896cb540-4bee-4349-a054-3bfa50c4bc70` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-b4688eed-fa77-4e7d-b4fd-6241ef99b784` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-7894e551-b766-4dd1-9db3-eed18494401f` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-4835ce5e-a061-4ae1-8e64-36aec7595b34` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-dc4b8031-dc92-458c-82da-f3b36c4e9820` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-8e5decd0-959b-4e98-988a-d6263c329ae8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-67e8d25d-b2b4-43b2-8a2d-65dd00296fa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67e8d25d-b2b4-43b2-8a2d-65dd00296fa1
Content-Type: application/json

--- request body ---
{"handle":"qa-45a699996863","displayName":"QA 45a699996863","password":"****","region":"eu"}

--- response: 201 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-67e8d25d-b2b4-43b2-8a2d-65dd00296fa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Location: /v1/accounts/qa-45a699996863
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d4c5f9b9-e528-46c6-aff7-25f10c77e895","handle":"qa-45a699996863","displayName":"QA 45a699996863","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.376214969Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-42730a11-bb92-4ced-96af-be453be0b3a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42730a11-bb92-4ced-96af-be453be0b3a2
Content-Type: application/json

--- request body ---
{"handle":"qa-c0b542e98f3a","displayName":"QA c0b542e98f3a","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-42730a11-bb92-4ced-96af-be453be0b3a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 8
Location: /v1/accounts/qa-c0b542e98f3a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2eee4eac-351f-45c8-a375-7668e0b3eb2c","handle":"qa-c0b542e98f3a","displayName":"QA c0b542e98f3a","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.419838770Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b9f0cb8e-8d79-47e8-8461-ae5cc83cd057

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9f0cb8e-8d79-47e8-8461-ae5cc83cd057
Content-Type: application/json

--- request body ---
{"handle":"qa-45a699996863","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9f0cb8e-8d79-47e8-8461-ae5cc83cd057
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4c5f9b9-e528-46c6-aff7-25f10c77e895"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1c3dbf42-f74d-4df6-9a6a-ec92dd862ffa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c3dbf42-f74d-4df6-9a6a-ec92dd862ffa
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c0b542e98f3a","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c3dbf42-f74d-4df6-9a6a-ec92dd862ffa
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
Location: /v1/conversations/cnv_22adc107-8cdd-4272-b69e-564439f95ee8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_22adc107-8cdd-4272-b69e-564439f95ee8","subject":"Error contract","status":"open","region":"eu","participants":["qa-45a699996863","qa-c0b542e98f3a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.470063561Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_22adc107-8cdd-4272-b69e-564439f95ee8/read
correlation: qa-896cb540-4bee-4349-a054-3bfa50c4bc70

--- request headers ---
Accept: application/json
X-Fault-Key: 8c8a8f2c-c2c0-4a4c-b6ba-a8eb608625bc
X-Fault: unavailable-once
X-Correlation-Id: qa-896cb540-4bee-4349-a054-3bfa50c4bc70
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-896cb540-4bee-4349-a054-3bfa50c4bc70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_22adc107-8cdd-4272-b69e-564439f95ee8/read","correlationId":"qa-896cb540-4bee-4349-a054-3bfa50c4bc70"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b4688eed-fa77-4e7d-b4fd-6241ef99b784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4688eed-fa77-4e7d-b4fd-6241ef99b784
Content-Type: application/json

--- request body ---
{"handle":"qa-c0b542e98f3a","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4688eed-fa77-4e7d-b4fd-6241ef99b784
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2eee4eac-351f-45c8-a375-7668e0b3eb2c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7894e551-b766-4dd1-9db3-eed18494401f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7894e551-b766-4dd1-9db3-eed18494401f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7894e551-b766-4dd1-9db3-eed18494401f
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
correlation: qa-4835ce5e-a061-4ae1-8e64-36aec7595b34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4835ce5e-a061-4ae1-8e64-36aec7595b34
Content-Type: application/json

--- request body ---
{"handle":"qa-c0b542e98f3a","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4835ce5e-a061-4ae1-8e64-36aec7595b34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 357
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4835ce5e-a061-4ae1-8e64-36aec7595b34"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dc4b8031-dc92-458c-82da-f3b36c4e9820

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc4b8031-dc92-458c-82da-f3b36c4e9820
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dc4b8031-dc92-458c-82da-f3b36c4e9820
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8e5decd0-959b-4e98-988a-d6263c329ae8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e5decd0-959b-4e98-988a-d6263c329ae8
Content-Type: application/json

--- request body ---
{"handle":"qa-45a699996863","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e5decd0-959b-4e98-988a-d6263c329ae8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8e5decd0-959b-4e98-988a-d6263c329ae8"}
```
