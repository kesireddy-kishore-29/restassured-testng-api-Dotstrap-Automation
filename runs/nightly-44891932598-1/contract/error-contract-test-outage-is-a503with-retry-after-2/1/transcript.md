# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[2]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-323d8fc4-4320-498b-bebe-0ca14a1a2b6c` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-efaf623e-2cfd-4e9c-8290-be596d55047a` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-08b5bb88-18d6-492f-a7b0-1e14f9172428` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-583d04b4-7b67-4aab-bf03-558093df3629` |
| 5 | `GET /v1/accounts/me` | 503 | 15 | `qa-2bd09464-18f6-4c1e-9769-4d10bc4f8560` |
| 6 | `POST /v1/auth/token` | 200 | 81 | `qa-35fdfdbd-03de-43bf-a294-3feb41e49171` |
| 7 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-8f3fff23-d7df-41aa-87c3-52db01f9a58e` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-8d184303-c3d7-4a46-b518-2b77aefeb932` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-81ce98be-0821-41ea-a025-1ac781aa9c6b` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-7aa8c59f-a08a-4d84-8633-eff496457f97` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-323d8fc4-4320-498b-bebe-0ca14a1a2b6c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-323d8fc4-4320-498b-bebe-0ca14a1a2b6c
Content-Type: application/json

--- request body ---
{"handle":"qa-b1655857f1f5","displayName":"QA b1655857f1f5","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-323d8fc4-4320-498b-bebe-0ca14a1a2b6c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Location: /v1/accounts/qa-b1655857f1f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_36f3234c-5776-4113-918d-ac8b1d99009b","handle":"qa-b1655857f1f5","displayName":"QA b1655857f1f5","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.138352351Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-efaf623e-2cfd-4e9c-8290-be596d55047a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efaf623e-2cfd-4e9c-8290-be596d55047a
Content-Type: application/json

--- request body ---
{"handle":"qa-94ea05793f87","displayName":"QA 94ea05793f87","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-efaf623e-2cfd-4e9c-8290-be596d55047a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Location: /v1/accounts/qa-94ea05793f87
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e55b08a9-d15c-4611-940b-025d165c6e4e","handle":"qa-94ea05793f87","displayName":"QA 94ea05793f87","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.188729808Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-08b5bb88-18d6-492f-a7b0-1e14f9172428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08b5bb88-18d6-492f-a7b0-1e14f9172428
Content-Type: application/json

--- request body ---
{"handle":"qa-b1655857f1f5","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-08b5bb88-18d6-492f-a7b0-1e14f9172428
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_36f3234c-5776-4113-918d-ac8b1d99009b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-583d04b4-7b67-4aab-bf03-558093df3629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-583d04b4-7b67-4aab-bf03-558093df3629
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-94ea05793f87","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-583d04b4-7b67-4aab-bf03-558093df3629
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
Location: /v1/conversations/cnv_84154ba1-f52e-4c67-a7fa-cce258168904
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_84154ba1-f52e-4c67-a7fa-cce258168904","subject":"Error contract","status":"open","region":"eu","participants":["qa-b1655857f1f5","qa-94ea05793f87"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.309703513Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-2bd09464-18f6-4c1e-9769-4d10bc4f8560

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b0b93e42-f163-4fad-9fc3-645e5ab01ddd
X-Correlation-Id: qa-2bd09464-18f6-4c1e-9769-4d10bc4f8560
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2bd09464-18f6-4c1e-9769-4d10bc4f8560
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-2bd09464-18f6-4c1e-9769-4d10bc4f8560"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-35fdfdbd-03de-43bf-a294-3feb41e49171

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35fdfdbd-03de-43bf-a294-3feb41e49171
Content-Type: application/json

--- request body ---
{"handle":"qa-94ea05793f87","password":"****"}

--- response: 200 in 81 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-35fdfdbd-03de-43bf-a294-3feb41e49171
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e55b08a9-d15c-4611-940b-025d165c6e4e"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8f3fff23-d7df-41aa-87c3-52db01f9a58e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f3fff23-d7df-41aa-87c3-52db01f9a58e
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8f3fff23-d7df-41aa-87c3-52db01f9a58e
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
correlation: qa-8d184303-c3d7-4a46-b518-2b77aefeb932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d184303-c3d7-4a46-b518-2b77aefeb932
Content-Type: application/json

--- request body ---
{"handle":"qa-94ea05793f87","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d184303-c3d7-4a46-b518-2b77aefeb932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d184303-c3d7-4a46-b518-2b77aefeb932"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-81ce98be-0821-41ea-a025-1ac781aa9c6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81ce98be-0821-41ea-a025-1ac781aa9c6b
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-81ce98be-0821-41ea-a025-1ac781aa9c6b
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
correlation: qa-7aa8c59f-a08a-4d84-8633-eff496457f97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aa8c59f-a08a-4d84-8633-eff496457f97
Content-Type: application/json

--- request body ---
{"handle":"qa-b1655857f1f5","password":"****"}

--- response: 401 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7aa8c59f-a08a-4d84-8633-eff496457f97
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7aa8c59f-a08a-4d84-8633-eff496457f97"}
```
