# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-fb7867eb-bce0-4116-9d93-51f9265cf485` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-2834309d-9206-4cf1-964a-025d97948ddb` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-059cb85c-b8e0-4e3a-a6a9-f9ae133e03f1` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-65259dce-5247-4ce5-9bda-0dc2dc9563c4` |
| 5 | `POST /v1/credits/purchases` | 503 | 11 | `qa-341ffa3c-0cd5-48b3-87c0-3e038b175a29` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-b5bb7d26-a002-4fbe-993a-d4fa402bbcea` |
| 7 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-a856b392-52d9-4fbd-962a-78b4f28e5101` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-c88168e2-8c9f-4b0d-96dd-e71ba339cb67` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-6af14fa5-b4a7-482f-9a4e-bfffac254cac` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-5090fe16-5019-4a56-83f6-e495fbee64b8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fb7867eb-bce0-4116-9d93-51f9265cf485

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb7867eb-bce0-4116-9d93-51f9265cf485
Content-Type: application/json

--- request body ---
{"handle":"qa-5405e2828174","displayName":"QA 5405e2828174","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb7867eb-bce0-4116-9d93-51f9265cf485
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Location: /v1/accounts/qa-5405e2828174
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31800ebc-6dfc-4d48-9ede-c8e8caae9074","handle":"qa-5405e2828174","displayName":"QA 5405e2828174","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.366662738Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2834309d-9206-4cf1-964a-025d97948ddb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2834309d-9206-4cf1-964a-025d97948ddb
Content-Type: application/json

--- request body ---
{"handle":"qa-255fa8a125c3","displayName":"QA 255fa8a125c3","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2834309d-9206-4cf1-964a-025d97948ddb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 337
RateLimit-Reset: 7
Location: /v1/accounts/qa-255fa8a125c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d023722-d389-4662-b4ff-0656530e43a0","handle":"qa-255fa8a125c3","displayName":"QA 255fa8a125c3","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.406283161Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-059cb85c-b8e0-4e3a-a6a9-f9ae133e03f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-059cb85c-b8e0-4e3a-a6a9-f9ae133e03f1
Content-Type: application/json

--- request body ---
{"handle":"qa-5405e2828174","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-059cb85c-b8e0-4e3a-a6a9-f9ae133e03f1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31800ebc-6dfc-4d48-9ede-c8e8caae9074"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-65259dce-5247-4ce5-9bda-0dc2dc9563c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65259dce-5247-4ce5-9bda-0dc2dc9563c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-255fa8a125c3","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-65259dce-5247-4ce5-9bda-0dc2dc9563c4
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
Location: /v1/conversations/cnv_0ddbd2a3-f0a1-4ce0-bc16-22f8cf068188
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0ddbd2a3-f0a1-4ce0-bc16-22f8cf068188","subject":"Error contract","status":"open","region":"eu","participants":["qa-5405e2828174","qa-255fa8a125c3"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.476027412Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-341ffa3c-0cd5-48b3-87c0-3e038b175a29

--- request headers ---
Accept: application/json
X-Fault-Key: e4e30250-c3f7-458b-8594-41d3f2d653a2
Idempotency-Key: qa-eb9df71f3bb44ab6b2226447789fcbb8
X-Fault: unavailable-once
X-Correlation-Id: qa-341ffa3c-0cd5-48b3-87c0-3e038b175a29
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-341ffa3c-0cd5-48b3-87c0-3e038b175a29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-341ffa3c-0cd5-48b3-87c0-3e038b175a29"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b5bb7d26-a002-4fbe-993a-d4fa402bbcea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5bb7d26-a002-4fbe-993a-d4fa402bbcea
Content-Type: application/json

--- request body ---
{"handle":"qa-255fa8a125c3","password":"****"}

--- response: 200 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5bb7d26-a002-4fbe-993a-d4fa402bbcea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d023722-d389-4662-b4ff-0656530e43a0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a856b392-52d9-4fbd-962a-78b4f28e5101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a856b392-52d9-4fbd-962a-78b4f28e5101
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a856b392-52d9-4fbd-962a-78b4f28e5101
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
correlation: qa-c88168e2-8c9f-4b0d-96dd-e71ba339cb67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c88168e2-8c9f-4b0d-96dd-e71ba339cb67
Content-Type: application/json

--- request body ---
{"handle":"qa-255fa8a125c3","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c88168e2-8c9f-4b0d-96dd-e71ba339cb67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c88168e2-8c9f-4b0d-96dd-e71ba339cb67"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6af14fa5-b4a7-482f-9a4e-bfffac254cac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6af14fa5-b4a7-482f-9a4e-bfffac254cac
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6af14fa5-b4a7-482f-9a4e-bfffac254cac
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
correlation: qa-5090fe16-5019-4a56-83f6-e495fbee64b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5090fe16-5019-4a56-83f6-e495fbee64b8
Content-Type: application/json

--- request body ---
{"handle":"qa-5405e2828174","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5090fe16-5019-4a56-83f6-e495fbee64b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5090fe16-5019-4a56-83f6-e495fbee64b8"}
```
