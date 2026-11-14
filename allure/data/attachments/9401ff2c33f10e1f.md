# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 66 | `qa-0b076f73-37fa-47a3-8d4a-497d91f36395` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-ce5ef560-d913-47a4-921c-5e7037ebed61` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-29c62b75-5269-4add-a1ac-3a1dec816523` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-0e988249-a27b-45c5-84e4-f9bfe7606851` |
| 5 | `PATCH /v1/accounts/me` | 503 | 28 | `qa-cdce7ffe-09d9-4d9d-bc45-b068e7714eb4` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-9bb1fc2c-4cd3-4d7e-bed3-53b5b562d113` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-2968be9f-7c9a-442a-abb5-a08860e85812` |
| 8 | `POST /v1/auth/token` | 401 | 36 | `qa-e4b6e5fa-a8bd-49c1-beda-2baeca09122e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-4839a27a-f6e3-48a1-ac47-42c2c5753067` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-c2181803-8503-49d9-a3c4-e33d13facef6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0b076f73-37fa-47a3-8d4a-497d91f36395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b076f73-37fa-47a3-8d4a-497d91f36395
Content-Type: application/json

--- request body ---
{"handle":"qa-301452b57b92","displayName":"QA 301452b57b92","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Sat, 14 Nov 2026 09:05:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b076f73-37fa-47a3-8d4a-497d91f36395
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
Location: /v1/accounts/qa-301452b57b92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bf292ecb-6a91-45d2-ab33-f24f89753792","handle":"qa-301452b57b92","displayName":"QA 301452b57b92","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.014233353Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ce5ef560-d913-47a4-921c-5e7037ebed61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce5ef560-d913-47a4-921c-5e7037ebed61
Content-Type: application/json

--- request body ---
{"handle":"qa-42b761fc24fd","displayName":"QA 42b761fc24fd","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce5ef560-d913-47a4-921c-5e7037ebed61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-42b761fc24fd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f6040d72-6231-44ab-88cb-f11f36895008","handle":"qa-42b761fc24fd","displayName":"QA 42b761fc24fd","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.062375867Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-29c62b75-5269-4add-a1ac-3a1dec816523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29c62b75-5269-4add-a1ac-3a1dec816523
Content-Type: application/json

--- request body ---
{"handle":"qa-301452b57b92","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-29c62b75-5269-4add-a1ac-3a1dec816523
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bf292ecb-6a91-45d2-ab33-f24f89753792"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0e988249-a27b-45c5-84e4-f9bfe7606851

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e988249-a27b-45c5-84e4-f9bfe7606851
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-42b761fc24fd","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e988249-a27b-45c5-84e4-f9bfe7606851
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
Location: /v1/conversations/cnv_89de5e4f-7fd9-4ea0-bfc2-8ef9b6a19762
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_89de5e4f-7fd9-4ea0-bfc2-8ef9b6a19762","subject":"Error contract","status":"open","region":"eu","participants":["qa-301452b57b92","qa-42b761fc24fd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.145029658Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-cdce7ffe-09d9-4d9d-bc45-b068e7714eb4

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 45c43de2-ae26-405f-9987-34d222f558c0
X-Correlation-Id: qa-cdce7ffe-09d9-4d9d-bc45-b068e7714eb4
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 28 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cdce7ffe-09d9-4d9d-bc45-b068e7714eb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-cdce7ffe-09d9-4d9d-bc45-b068e7714eb4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9bb1fc2c-4cd3-4d7e-bed3-53b5b562d113

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bb1fc2c-4cd3-4d7e-bed3-53b5b562d113
Content-Type: application/json

--- request body ---
{"handle":"qa-42b761fc24fd","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bb1fc2c-4cd3-4d7e-bed3-53b5b562d113
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f6040d72-6231-44ab-88cb-f11f36895008"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2968be9f-7c9a-442a-abb5-a08860e85812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2968be9f-7c9a-442a-abb5-a08860e85812
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2968be9f-7c9a-442a-abb5-a08860e85812
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
correlation: qa-e4b6e5fa-a8bd-49c1-beda-2baeca09122e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4b6e5fa-a8bd-49c1-beda-2baeca09122e
Content-Type: application/json

--- request body ---
{"handle":"qa-42b761fc24fd","password":"****"}

--- response: 401 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e4b6e5fa-a8bd-49c1-beda-2baeca09122e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e4b6e5fa-a8bd-49c1-beda-2baeca09122e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4839a27a-f6e3-48a1-ac47-42c2c5753067

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4839a27a-f6e3-48a1-ac47-42c2c5753067
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4839a27a-f6e3-48a1-ac47-42c2c5753067
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
correlation: qa-c2181803-8503-49d9-a3c4-e33d13facef6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2181803-8503-49d9-a3c4-e33d13facef6
Content-Type: application/json

--- request body ---
{"handle":"qa-301452b57b92","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2181803-8503-49d9-a3c4-e33d13facef6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 496
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c2181803-8503-49d9-a3c4-e33d13facef6"}
```
