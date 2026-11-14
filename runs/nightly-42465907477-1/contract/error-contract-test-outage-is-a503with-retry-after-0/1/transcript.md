# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-5f7395f9-1506-4d51-ab65-f5160d5e72dd` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-30d4fb92-044d-4584-9fb3-efb74af9ccca` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-97365680-e754-41bb-ba01-e849521b6999` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-316d6ff2-91dd-4d38-8675-8c739d2820d5` |
| 5 | `POST /v1/auth/token` | 503 | 11 | `qa-61f49e17-f915-4264-9951-7cb002dbd602` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-fb3ba2af-854b-4372-9d63-26fb66399355` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-09a2dccd-2753-4e5f-83a4-1ee71875d15d` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-98d73ce5-e6b2-49e0-9d35-ca41667fb9a5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-e88eb422-3da1-476d-84a2-d0a88cb57780` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-a22a0d8d-fe29-498f-bc9c-d0b811457368` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5f7395f9-1506-4d51-ab65-f5160d5e72dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f7395f9-1506-4d51-ab65-f5160d5e72dd
Content-Type: application/json

--- request body ---
{"handle":"qa-fb276d1999fd","displayName":"QA fb276d1999fd","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5f7395f9-1506-4d51-ab65-f5160d5e72dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-fb276d1999fd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_197fe134-8b1e-459e-a30e-b1c6eef56c03","handle":"qa-fb276d1999fd","displayName":"QA fb276d1999fd","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.696276688Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-30d4fb92-044d-4584-9fb3-efb74af9ccca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30d4fb92-044d-4584-9fb3-efb74af9ccca
Content-Type: application/json

--- request body ---
{"handle":"qa-62a9caff50d1","displayName":"QA 62a9caff50d1","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-30d4fb92-044d-4584-9fb3-efb74af9ccca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 10
Location: /v1/accounts/qa-62a9caff50d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f1c5ec67-0474-43f8-bf96-6abde20af435","handle":"qa-62a9caff50d1","displayName":"QA 62a9caff50d1","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.731320344Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-97365680-e754-41bb-ba01-e849521b6999

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97365680-e754-41bb-ba01-e849521b6999
Content-Type: application/json

--- request body ---
{"handle":"qa-fb276d1999fd","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-97365680-e754-41bb-ba01-e849521b6999
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_197fe134-8b1e-459e-a30e-b1c6eef56c03"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-316d6ff2-91dd-4d38-8675-8c739d2820d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-316d6ff2-91dd-4d38-8675-8c739d2820d5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-62a9caff50d1","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-316d6ff2-91dd-4d38-8675-8c739d2820d5
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
Location: /v1/conversations/cnv_96f96355-a2f0-4e25-8578-95b777eaf1dd
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_96f96355-a2f0-4e25-8578-95b777eaf1dd","subject":"Error contract","status":"open","region":"eu","participants":["qa-fb276d1999fd","qa-62a9caff50d1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.817061069Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-61f49e17-f915-4264-9951-7cb002dbd602

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 19400a29-eca8-4759-bd3f-9ab8f134bb52
X-Correlation-Id: qa-61f49e17-f915-4264-9951-7cb002dbd602
Content-Type: application/json

--- request body ---
{"handle":"qa-fb276d1999fd","password":"****"}

--- response: 503 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-61f49e17-f915-4264-9951-7cb002dbd602
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-61f49e17-f915-4264-9951-7cb002dbd602"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fb3ba2af-854b-4372-9d63-26fb66399355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb3ba2af-854b-4372-9d63-26fb66399355
Content-Type: application/json

--- request body ---
{"handle":"qa-62a9caff50d1","password":"****"}

--- response: 200 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb3ba2af-854b-4372-9d63-26fb66399355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f1c5ec67-0474-43f8-bf96-6abde20af435"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09a2dccd-2753-4e5f-83a4-1ee71875d15d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a2dccd-2753-4e5f-83a4-1ee71875d15d
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09a2dccd-2753-4e5f-83a4-1ee71875d15d
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
correlation: qa-98d73ce5-e6b2-49e0-9d35-ca41667fb9a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98d73ce5-e6b2-49e0-9d35-ca41667fb9a5
Content-Type: application/json

--- request body ---
{"handle":"qa-62a9caff50d1","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98d73ce5-e6b2-49e0-9d35-ca41667fb9a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98d73ce5-e6b2-49e0-9d35-ca41667fb9a5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e88eb422-3da1-476d-84a2-d0a88cb57780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e88eb422-3da1-476d-84a2-d0a88cb57780
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e88eb422-3da1-476d-84a2-d0a88cb57780
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
correlation: qa-a22a0d8d-fe29-498f-bc9c-d0b811457368

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a22a0d8d-fe29-498f-bc9c-d0b811457368
Content-Type: application/json

--- request body ---
{"handle":"qa-fb276d1999fd","password":"****"}

--- response: 401 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a22a0d8d-fe29-498f-bc9c-d0b811457368
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a22a0d8d-fe29-498f-bc9c-d0b811457368"}
```
