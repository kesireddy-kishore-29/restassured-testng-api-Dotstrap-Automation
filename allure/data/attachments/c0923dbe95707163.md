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
| 1 | `POST /v1/accounts` | 201 | 46 | `qa-ccc8d06d-072b-4fe5-9f40-e9ceab23c213` |
| 2 | `POST /v1/accounts` | 201 | 56 | `qa-6336bcef-452e-4e02-a7fa-4e6fd14d4daf` |
| 3 | `POST /v1/auth/token` | 200 | 35 | `qa-3c94d9f5-f153-4e1a-8c6a-885352b450da` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-2f10d674-42a0-4dab-a491-4878ecc8b366` |
| 5 | `DELETE /v1/accounts/me` | 503 | 36 | `qa-784d8e05-e446-40fa-9f8f-546b590cf40c` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-985c159d-9247-48fa-ab0c-077e3a03c57e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-de1a8c7b-a472-493b-aa47-58a0a09998d8` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-0ff9272c-4c09-4d02-bb5e-93d5d4719827` |
| 9 | `DELETE /v1/accounts/me` | 204 | 43 | `qa-840cfbfc-4511-4466-afe8-78f6295f7586` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-d06cbdd1-80e6-4e11-89f6-7116705f5451` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ccc8d06d-072b-4fe5-9f40-e9ceab23c213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccc8d06d-072b-4fe5-9f40-e9ceab23c213
Content-Type: application/json

--- request body ---
{"handle":"qa-7966c76d92dc","displayName":"QA 7966c76d92dc","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccc8d06d-072b-4fe5-9f40-e9ceab23c213
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Location: /v1/accounts/qa-7966c76d92dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9d501a0d-4c00-4744-bc0b-7399f3f75ed6","handle":"qa-7966c76d92dc","displayName":"QA 7966c76d92dc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.800715754Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6336bcef-452e-4e02-a7fa-4e6fd14d4daf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6336bcef-452e-4e02-a7fa-4e6fd14d4daf
Content-Type: application/json

--- request body ---
{"handle":"qa-adc3abc31f97","displayName":"QA adc3abc31f97","password":"****","region":"eu"}

--- response: 201 in 56 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6336bcef-452e-4e02-a7fa-4e6fd14d4daf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-adc3abc31f97
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2ea4ef20-072c-4dd5-8930-ca313f0b319d","handle":"qa-adc3abc31f97","displayName":"QA adc3abc31f97","region":"eu","role":"user","createdAt":"2026-11-21T09:57:10.896289082Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3c94d9f5-f153-4e1a-8c6a-885352b450da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c94d9f5-f153-4e1a-8c6a-885352b450da
Content-Type: application/json

--- request body ---
{"handle":"qa-7966c76d92dc","password":"****"}

--- response: 200 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c94d9f5-f153-4e1a-8c6a-885352b450da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9d501a0d-4c00-4744-bc0b-7399f3f75ed6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2f10d674-42a0-4dab-a491-4878ecc8b366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f10d674-42a0-4dab-a491-4878ecc8b366
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-adc3abc31f97","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f10d674-42a0-4dab-a491-4878ecc8b366
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
Location: /v1/conversations/cnv_ab5aa185-b35c-40fb-ae5e-6421858a2e3d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ab5aa185-b35c-40fb-ae5e-6421858a2e3d","subject":"Error contract","status":"open","region":"eu","participants":["qa-7966c76d92dc","qa-adc3abc31f97"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.013662956Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-784d8e05-e446-40fa-9f8f-546b590cf40c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6d14e38e-52f2-459e-afef-dae153fbf599
X-Correlation-Id: qa-784d8e05-e446-40fa-9f8f-546b590cf40c
Content-Type: application/json

--- response: 503 in 36 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-784d8e05-e446-40fa-9f8f-546b590cf40c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-784d8e05-e446-40fa-9f8f-546b590cf40c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-985c159d-9247-48fa-ab0c-077e3a03c57e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-985c159d-9247-48fa-ab0c-077e3a03c57e
Content-Type: application/json

--- request body ---
{"handle":"qa-adc3abc31f97","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-985c159d-9247-48fa-ab0c-077e3a03c57e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2ea4ef20-072c-4dd5-8930-ca313f0b319d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de1a8c7b-a472-493b-aa47-58a0a09998d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de1a8c7b-a472-493b-aa47-58a0a09998d8
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de1a8c7b-a472-493b-aa47-58a0a09998d8
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
correlation: qa-0ff9272c-4c09-4d02-bb5e-93d5d4719827

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ff9272c-4c09-4d02-bb5e-93d5d4719827
Content-Type: application/json

--- request body ---
{"handle":"qa-adc3abc31f97","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ff9272c-4c09-4d02-bb5e-93d5d4719827
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ff9272c-4c09-4d02-bb5e-93d5d4719827"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-840cfbfc-4511-4466-afe8-78f6295f7586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-840cfbfc-4511-4466-afe8-78f6295f7586
Content-Type: application/json

--- response: 204 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-840cfbfc-4511-4466-afe8-78f6295f7586
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
correlation: qa-d06cbdd1-80e6-4e11-89f6-7116705f5451

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d06cbdd1-80e6-4e11-89f6-7116705f5451
Content-Type: application/json

--- request body ---
{"handle":"qa-7966c76d92dc","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d06cbdd1-80e6-4e11-89f6-7116705f5451
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d06cbdd1-80e6-4e11-89f6-7116705f5451"}
```
