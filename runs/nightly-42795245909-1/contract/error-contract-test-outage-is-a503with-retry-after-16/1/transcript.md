# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-168265f1-f99d-483c-b8e8-a501ca55af86` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-e74e0b5e-7418-4cec-b42f-d98c85cd6b1c` |
| 3 | `POST /v1/auth/token` | 200 | 18 | `qa-a472f915-a95d-473f-be62-2d3f785ab0e2` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-62297c86-86f4-4e5f-a76b-ef3a81081977` |
| 5 | `GET /v1/admin/stats` | 503 | 3 | `qa-68bff450-de81-40d4-b4ae-63023e501441` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-6693a565-8b72-4c5e-b67b-7556471bb026` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-6ea50961-2a2b-47a2-91e5-41f0d373962d` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-0e2b1d7e-7088-4d07-a39a-88d1fd3e2136` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-eb21a6b4-865a-4b7f-af58-4319055b4678` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-33b45e6b-0021-40ab-adb5-fc41513f95fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-168265f1-f99d-483c-b8e8-a501ca55af86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-168265f1-f99d-483c-b8e8-a501ca55af86
Content-Type: application/json

--- request body ---
{"handle":"qa-9c1db1ee70f7","displayName":"QA 9c1db1ee70f7","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-168265f1-f99d-483c-b8e8-a501ca55af86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 7
Location: /v1/accounts/qa-9c1db1ee70f7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3120fb9c-b086-4647-9c35-ea225253ff57","handle":"qa-9c1db1ee70f7","displayName":"QA 9c1db1ee70f7","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.639248676Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e74e0b5e-7418-4cec-b42f-d98c85cd6b1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e74e0b5e-7418-4cec-b42f-d98c85cd6b1c
Content-Type: application/json

--- request body ---
{"handle":"qa-b6a6ffc0ee18","displayName":"QA b6a6ffc0ee18","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e74e0b5e-7418-4cec-b42f-d98c85cd6b1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 312
RateLimit-Reset: 7
Location: /v1/accounts/qa-b6a6ffc0ee18
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e4e60ae7-1fd8-4cc6-9ca3-723f77854b8c","handle":"qa-b6a6ffc0ee18","displayName":"QA b6a6ffc0ee18","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.663436586Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a472f915-a95d-473f-be62-2d3f785ab0e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a472f915-a95d-473f-be62-2d3f785ab0e2
Content-Type: application/json

--- request body ---
{"handle":"qa-9c1db1ee70f7","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-a472f915-a95d-473f-be62-2d3f785ab0e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3120fb9c-b086-4647-9c35-ea225253ff57"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-62297c86-86f4-4e5f-a76b-ef3a81081977

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62297c86-86f4-4e5f-a76b-ef3a81081977
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b6a6ffc0ee18","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-62297c86-86f4-4e5f-a76b-ef3a81081977
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
Location: /v1/conversations/cnv_e7c5893d-eb54-4200-9239-1b08861fb1a2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e7c5893d-eb54-4200-9239-1b08861fb1a2","subject":"Error contract","status":"open","region":"eu","participants":["qa-9c1db1ee70f7","qa-b6a6ffc0ee18"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.698540309Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-68bff450-de81-40d4-b4ae-63023e501441

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ce7f0556-c4cf-44f1-84f9-e6107669589c
X-Correlation-Id: qa-68bff450-de81-40d4-b4ae-63023e501441
Content-Type: application/json

--- response: 503 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68bff450-de81-40d4-b4ae-63023e501441
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-68bff450-de81-40d4-b4ae-63023e501441"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6693a565-8b72-4c5e-b67b-7556471bb026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6693a565-8b72-4c5e-b67b-7556471bb026
Content-Type: application/json

--- request body ---
{"handle":"qa-b6a6ffc0ee18","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6693a565-8b72-4c5e-b67b-7556471bb026
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e4e60ae7-1fd8-4cc6-9ca3-723f77854b8c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ea50961-2a2b-47a2-91e5-41f0d373962d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ea50961-2a2b-47a2-91e5-41f0d373962d
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ea50961-2a2b-47a2-91e5-41f0d373962d
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
correlation: qa-0e2b1d7e-7088-4d07-a39a-88d1fd3e2136

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e2b1d7e-7088-4d07-a39a-88d1fd3e2136
Content-Type: application/json

--- request body ---
{"handle":"qa-b6a6ffc0ee18","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0e2b1d7e-7088-4d07-a39a-88d1fd3e2136
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0e2b1d7e-7088-4d07-a39a-88d1fd3e2136"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb21a6b4-865a-4b7f-af58-4319055b4678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb21a6b4-865a-4b7f-af58-4319055b4678
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb21a6b4-865a-4b7f-af58-4319055b4678
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
correlation: qa-33b45e6b-0021-40ab-adb5-fc41513f95fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33b45e6b-0021-40ab-adb5-fc41513f95fb
Content-Type: application/json

--- request body ---
{"handle":"qa-9c1db1ee70f7","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-33b45e6b-0021-40ab-adb5-fc41513f95fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-33b45e6b-0021-40ab-adb5-fc41513f95fb"}
```
