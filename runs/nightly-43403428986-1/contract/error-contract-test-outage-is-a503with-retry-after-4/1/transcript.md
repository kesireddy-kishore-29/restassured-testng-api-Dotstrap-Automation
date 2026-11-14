# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 40 | `qa-6d250f19-252f-46e7-a045-f1167ff7df1e` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-04494a6d-ed00-4768-beb2-162e180153f8` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-1ef52c04-fe54-4ea3-ad52-9ed43ea999cb` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-4ac98cdb-d71b-4dd4-bb33-04462a3fa67e` |
| 5 | `DELETE /v1/accounts/me` | 503 | 23 | `qa-3d17fec8-3920-4acc-ab1e-c98d008f4d40` |
| 6 | `POST /v1/auth/token` | 200 | 43 | `qa-f52f47c7-da81-41f6-938e-d31fc87114ca` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-abe73bec-7a87-46ea-926d-fb441324cedb` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-3f58067e-5b6e-42e0-8913-3ca0c71379a8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-37d7a967-bf6a-4251-a282-0fd37f0d2425` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-c485f23c-9705-4ce1-8b7f-0bd1a5d00843` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d250f19-252f-46e7-a045-f1167ff7df1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d250f19-252f-46e7-a045-f1167ff7df1e
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f5c87850e4","displayName":"QA d5f5c87850e4","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d250f19-252f-46e7-a045-f1167ff7df1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Location: /v1/accounts/qa-d5f5c87850e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_28cdc52c-c4d6-40f3-b301-8fa0103571ae","handle":"qa-d5f5c87850e4","displayName":"QA d5f5c87850e4","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.015639852Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-04494a6d-ed00-4768-beb2-162e180153f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04494a6d-ed00-4768-beb2-162e180153f8
Content-Type: application/json

--- request body ---
{"handle":"qa-c7615a9fa798","displayName":"QA c7615a9fa798","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-04494a6d-ed00-4768-beb2-162e180153f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-c7615a9fa798
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d5cfe68-9a98-4649-a6ce-fa900e2f581a","handle":"qa-c7615a9fa798","displayName":"QA c7615a9fa798","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.059223103Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1ef52c04-fe54-4ea3-ad52-9ed43ea999cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ef52c04-fe54-4ea3-ad52-9ed43ea999cb
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f5c87850e4","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ef52c04-fe54-4ea3-ad52-9ed43ea999cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_28cdc52c-c4d6-40f3-b301-8fa0103571ae"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4ac98cdb-d71b-4dd4-bb33-04462a3fa67e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ac98cdb-d71b-4dd4-bb33-04462a3fa67e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c7615a9fa798","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ac98cdb-d71b-4dd4-bb33-04462a3fa67e
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
Location: /v1/conversations/cnv_77137baf-29db-4950-918d-2e1cdc442943
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_77137baf-29db-4950-918d-2e1cdc442943","subject":"Error contract","status":"open","region":"eu","participants":["qa-d5f5c87850e4","qa-c7615a9fa798"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:07.135629574Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d17fec8-3920-4acc-ab1e-c98d008f4d40

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 974fdd84-922d-4ae1-9756-f14d07e16b7c
X-Correlation-Id: qa-3d17fec8-3920-4acc-ab1e-c98d008f4d40
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d17fec8-3920-4acc-ab1e-c98d008f4d40
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-3d17fec8-3920-4acc-ab1e-c98d008f4d40"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f52f47c7-da81-41f6-938e-d31fc87114ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f52f47c7-da81-41f6-938e-d31fc87114ca
Content-Type: application/json

--- request body ---
{"handle":"qa-c7615a9fa798","password":"****"}

--- response: 200 in 43 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f52f47c7-da81-41f6-938e-d31fc87114ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 441
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d5cfe68-9a98-4649-a6ce-fa900e2f581a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-abe73bec-7a87-46ea-926d-fb441324cedb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe73bec-7a87-46ea-926d-fb441324cedb
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-abe73bec-7a87-46ea-926d-fb441324cedb
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
correlation: qa-3f58067e-5b6e-42e0-8913-3ca0c71379a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f58067e-5b6e-42e0-8913-3ca0c71379a8
Content-Type: application/json

--- request body ---
{"handle":"qa-c7615a9fa798","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f58067e-5b6e-42e0-8913-3ca0c71379a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3f58067e-5b6e-42e0-8913-3ca0c71379a8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-37d7a967-bf6a-4251-a282-0fd37f0d2425

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37d7a967-bf6a-4251-a282-0fd37f0d2425
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-37d7a967-bf6a-4251-a282-0fd37f0d2425
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
correlation: qa-c485f23c-9705-4ce1-8b7f-0bd1a5d00843

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c485f23c-9705-4ce1-8b7f-0bd1a5d00843
Content-Type: application/json

--- request body ---
{"handle":"qa-d5f5c87850e4","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c485f23c-9705-4ce1-8b7f-0bd1a5d00843
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c485f23c-9705-4ce1-8b7f-0bd1a5d00843"}
```
