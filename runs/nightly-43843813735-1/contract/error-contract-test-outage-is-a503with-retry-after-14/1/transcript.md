# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-e2d3b690-8e29-401f-b3d4-581a4cc7b777` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-12aa165f-543f-4748-a0b0-658abc467b90` |
| 3 | `POST /v1/auth/token` | 200 | 64 | `qa-b31df92a-60c3-4bc6-979b-28320166dc87` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-5b8c6eff-32bd-4ea1-9194-3163b3d4724e` |
| 5 | `GET /v1/credits/ledger` | 503 | 21 | `qa-95e0ea68-9be8-4946-be96-a466e27e9d49` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-5c4f00e8-db8d-40ef-9cba-e6c9eaba1523` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-91fd3d06-4dac-4f3d-b81d-ff35376802e4` |
| 8 | `POST /v1/auth/token` | 401 | 32 | `qa-1070a84b-fba9-45f2-9c98-a9a40c9870df` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-e78b19c8-2f14-4261-b4e7-80fc07e5e488` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-8d953bc8-2096-4a64-9cab-9700d0230f01` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e2d3b690-8e29-401f-b3d4-581a4cc7b777

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2d3b690-8e29-401f-b3d4-581a4cc7b777
Content-Type: application/json

--- request body ---
{"handle":"qa-a49f7007b4bd","displayName":"QA a49f7007b4bd","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2d3b690-8e29-401f-b3d4-581a4cc7b777
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 7
Location: /v1/accounts/qa-a49f7007b4bd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a80daba-81d5-4aba-861f-b30ec9f9978a","handle":"qa-a49f7007b4bd","displayName":"QA a49f7007b4bd","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.059643557Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-12aa165f-543f-4748-a0b0-658abc467b90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12aa165f-543f-4748-a0b0-658abc467b90
Content-Type: application/json

--- request body ---
{"handle":"qa-787ea397141b","displayName":"QA 787ea397141b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-12aa165f-543f-4748-a0b0-658abc467b90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Location: /v1/accounts/qa-787ea397141b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_962ba90e-5314-4d82-b282-1b9f27e10c88","handle":"qa-787ea397141b","displayName":"QA 787ea397141b","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.095576693Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b31df92a-60c3-4bc6-979b-28320166dc87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b31df92a-60c3-4bc6-979b-28320166dc87
Content-Type: application/json

--- request body ---
{"handle":"qa-a49f7007b4bd","password":"****"}

--- response: 200 in 64 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-b31df92a-60c3-4bc6-979b-28320166dc87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a80daba-81d5-4aba-861f-b30ec9f9978a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5b8c6eff-32bd-4ea1-9194-3163b3d4724e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b8c6eff-32bd-4ea1-9194-3163b3d4724e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-787ea397141b","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b8c6eff-32bd-4ea1-9194-3163b3d4724e
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
Location: /v1/conversations/cnv_8350bb07-a145-4de3-bccc-72d2a72cd317
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8350bb07-a145-4de3-bccc-72d2a72cd317","subject":"Error contract","status":"open","region":"eu","participants":["qa-a49f7007b4bd","qa-787ea397141b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.215256147Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-95e0ea68-9be8-4946-be96-a466e27e9d49

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c59fdf8d-0801-468b-9789-f8d6b674a0b4
X-Correlation-Id: qa-95e0ea68-9be8-4946-be96-a466e27e9d49
Content-Type: application/json

--- response: 503 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95e0ea68-9be8-4946-be96-a466e27e9d49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-95e0ea68-9be8-4946-be96-a466e27e9d49"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c4f00e8-db8d-40ef-9cba-e6c9eaba1523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c4f00e8-db8d-40ef-9cba-e6c9eaba1523
Content-Type: application/json

--- request body ---
{"handle":"qa-787ea397141b","password":"****"}

--- response: 200 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c4f00e8-db8d-40ef-9cba-e6c9eaba1523
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_962ba90e-5314-4d82-b282-1b9f27e10c88"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-91fd3d06-4dac-4f3d-b81d-ff35376802e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91fd3d06-4dac-4f3d-b81d-ff35376802e4
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-91fd3d06-4dac-4f3d-b81d-ff35376802e4
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
correlation: qa-1070a84b-fba9-45f2-9c98-a9a40c9870df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1070a84b-fba9-45f2-9c98-a9a40c9870df
Content-Type: application/json

--- request body ---
{"handle":"qa-787ea397141b","password":"****"}

--- response: 401 in 32 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1070a84b-fba9-45f2-9c98-a9a40c9870df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1070a84b-fba9-45f2-9c98-a9a40c9870df"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e78b19c8-2f14-4261-b4e7-80fc07e5e488

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e78b19c8-2f14-4261-b4e7-80fc07e5e488
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e78b19c8-2f14-4261-b4e7-80fc07e5e488
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
correlation: qa-8d953bc8-2096-4a64-9cab-9700d0230f01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d953bc8-2096-4a64-9cab-9700d0230f01
Content-Type: application/json

--- request body ---
{"handle":"qa-a49f7007b4bd","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d953bc8-2096-4a64-9cab-9700d0230f01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d953bc8-2096-4a64-9cab-9700d0230f01"}
```
