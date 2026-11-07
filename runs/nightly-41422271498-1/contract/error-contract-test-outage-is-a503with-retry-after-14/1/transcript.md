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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-c11f8229-a681-4d80-946a-c184cb34a007` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-6a21304b-719a-4b6b-bdbd-429ef8bdd49c` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-ba0f3a5b-4ff7-4e9f-bdef-258b67ce4627` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-5909aa14-6887-475d-a33f-77a57bb2c5e4` |
| 5 | `GET /v1/credits/ledger` | 503 | 43 | `qa-b6cd04e1-535f-4092-b6f1-7f0c2156102d` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-f3ad5ee1-b6a3-4be5-88d1-9bf64ddf1830` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-7e549671-050a-40fb-ac30-b5e6f352515d` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-0ab5264e-3c71-4ec0-afea-c610573b26a6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-112565f7-c129-48e2-b4a3-252a7e3f8b9a` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-7fd97328-c169-4d11-bf15-fd362742685e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c11f8229-a681-4d80-946a-c184cb34a007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c11f8229-a681-4d80-946a-c184cb34a007
Content-Type: application/json

--- request body ---
{"handle":"qa-63d19af6ef2f","displayName":"QA 63d19af6ef2f","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c11f8229-a681-4d80-946a-c184cb34a007
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Location: /v1/accounts/qa-63d19af6ef2f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_221a9c2d-bb06-449f-b2e2-c8efc8468639","handle":"qa-63d19af6ef2f","displayName":"QA 63d19af6ef2f","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.208099435Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6a21304b-719a-4b6b-bdbd-429ef8bdd49c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a21304b-719a-4b6b-bdbd-429ef8bdd49c
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0ec0561a41","displayName":"QA 0f0ec0561a41","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a21304b-719a-4b6b-bdbd-429ef8bdd49c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Location: /v1/accounts/qa-0f0ec0561a41
X-Served-Region: eu
Content-Length: 181

{"id":"acc_873c47c6-db5c-4f18-b67a-6663783e4722","handle":"qa-0f0ec0561a41","displayName":"QA 0f0ec0561a41","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.234073932Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ba0f3a5b-4ff7-4e9f-bdef-258b67ce4627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba0f3a5b-4ff7-4e9f-bdef-258b67ce4627
Content-Type: application/json

--- request body ---
{"handle":"qa-63d19af6ef2f","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba0f3a5b-4ff7-4e9f-bdef-258b67ce4627
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_221a9c2d-bb06-449f-b2e2-c8efc8468639"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5909aa14-6887-475d-a33f-77a57bb2c5e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5909aa14-6887-475d-a33f-77a57bb2c5e4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0f0ec0561a41","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-5909aa14-6887-475d-a33f-77a57bb2c5e4
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
Location: /v1/conversations/cnv_98868db1-2c4b-4158-9eef-be6b31422311
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_98868db1-2c4b-4158-9eef-be6b31422311","subject":"Error contract","status":"open","region":"eu","participants":["qa-63d19af6ef2f","qa-0f0ec0561a41"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.293968206Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-b6cd04e1-535f-4092-b6f1-7f0c2156102d

--- request headers ---
Accept: application/json
X-Fault-Key: 7c624c19-1dbe-4fc3-ba83-a6376de797ac
X-Fault: unavailable-once
X-Correlation-Id: qa-b6cd04e1-535f-4092-b6f1-7f0c2156102d
Content-Type: application/json

--- response: 503 in 43 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6cd04e1-535f-4092-b6f1-7f0c2156102d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-b6cd04e1-535f-4092-b6f1-7f0c2156102d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f3ad5ee1-b6a3-4be5-88d1-9bf64ddf1830

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3ad5ee1-b6a3-4be5-88d1-9bf64ddf1830
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0ec0561a41","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3ad5ee1-b6a3-4be5-88d1-9bf64ddf1830
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 352
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_873c47c6-db5c-4f18-b67a-6663783e4722"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7e549671-050a-40fb-ac30-b5e6f352515d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e549671-050a-40fb-ac30-b5e6f352515d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7e549671-050a-40fb-ac30-b5e6f352515d
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
correlation: qa-0ab5264e-3c71-4ec0-afea-c610573b26a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ab5264e-3c71-4ec0-afea-c610573b26a6
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0ec0561a41","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ab5264e-3c71-4ec0-afea-c610573b26a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ab5264e-3c71-4ec0-afea-c610573b26a6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-112565f7-c129-48e2-b4a3-252a7e3f8b9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-112565f7-c129-48e2-b4a3-252a7e3f8b9a
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-112565f7-c129-48e2-b4a3-252a7e3f8b9a
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
correlation: qa-7fd97328-c169-4d11-bf15-fd362742685e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fd97328-c169-4d11-bf15-fd362742685e
Content-Type: application/json

--- request body ---
{"handle":"qa-63d19af6ef2f","password":"****"}

--- response: 401 in 24 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7fd97328-c169-4d11-bf15-fd362742685e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7fd97328-c169-4d11-bf15-fd362742685e"}
```
