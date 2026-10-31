# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-3a861050-859b-4e84-9795-e75b1472e7ab` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-d741e5ac-0f7e-4588-a074-3af778482205` |
| 3 | `POST /v1/auth/token` | 200 | 37 | `qa-70de4c9f-c91c-4a17-bd9c-0cce97146732` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-719bf658-6d6f-44fb-a5ed-fb8d04e6c8fb` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 13 | `qa-0bbb3d35-cb72-441d-94c2-550cb82f4a91` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-e37a72cd-7c69-4d37-97b7-d5459f192f4e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-19a84b98-015f-4e09-bcd7-c5c9e3f7ce0a` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-d1da1bf6-9092-488d-813a-a22b254efffb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 40 | `qa-1db4e65c-1da8-4e34-9b74-e0d817a06f40` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-cc52af32-51c5-4a3a-b441-f6b89479e1a9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a861050-859b-4e84-9795-e75b1472e7ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a861050-859b-4e84-9795-e75b1472e7ab
Content-Type: application/json

--- request body ---
{"handle":"qa-34af907d5e9b","displayName":"QA 34af907d5e9b","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a861050-859b-4e84-9795-e75b1472e7ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 372
RateLimit-Reset: 7
Location: /v1/accounts/qa-34af907d5e9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b504deba-6366-4412-9838-38c83724104a","handle":"qa-34af907d5e9b","displayName":"QA 34af907d5e9b","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.197529410Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d741e5ac-0f7e-4588-a074-3af778482205

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d741e5ac-0f7e-4588-a074-3af778482205
Content-Type: application/json

--- request body ---
{"handle":"qa-27eac78f0f33","displayName":"QA 27eac78f0f33","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-d741e5ac-0f7e-4588-a074-3af778482205
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 6
Location: /v1/accounts/qa-27eac78f0f33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14b3e95a-cfa5-4c01-a6bb-f75e0666b59f","handle":"qa-27eac78f0f33","displayName":"QA 27eac78f0f33","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.229763469Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-70de4c9f-c91c-4a17-bd9c-0cce97146732

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70de4c9f-c91c-4a17-bd9c-0cce97146732
Content-Type: application/json

--- request body ---
{"handle":"qa-34af907d5e9b","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-70de4c9f-c91c-4a17-bd9c-0cce97146732
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b504deba-6366-4412-9838-38c83724104a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-719bf658-6d6f-44fb-a5ed-fb8d04e6c8fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-719bf658-6d6f-44fb-a5ed-fb8d04e6c8fb
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-27eac78f0f33","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-719bf658-6d6f-44fb-a5ed-fb8d04e6c8fb
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
Location: /v1/conversations/cnv_b18e9e9a-13c4-4e69-80e1-1aebdaef670d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b18e9e9a-13c4-4e69-80e1-1aebdaef670d","subject":"Error contract","status":"open","region":"eu","participants":["qa-34af907d5e9b","qa-27eac78f0f33"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.328337101Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b18e9e9a-13c4-4e69-80e1-1aebdaef670d/close
correlation: qa-0bbb3d35-cb72-441d-94c2-550cb82f4a91

--- request headers ---
Accept: application/json
X-Fault-Key: de56c29d-68e6-45e9-abe1-24c91c641003
X-Fault: unavailable-once
X-Correlation-Id: qa-0bbb3d35-cb72-441d-94c2-550cb82f4a91
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bbb3d35-cb72-441d-94c2-550cb82f4a91
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_b18e9e9a-13c4-4e69-80e1-1aebdaef670d/close","correlationId":"qa-0bbb3d35-cb72-441d-94c2-550cb82f4a91"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e37a72cd-7c69-4d37-97b7-d5459f192f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e37a72cd-7c69-4d37-97b7-d5459f192f4e
Content-Type: application/json

--- request body ---
{"handle":"qa-27eac78f0f33","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-e37a72cd-7c69-4d37-97b7-d5459f192f4e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 340
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14b3e95a-cfa5-4c01-a6bb-f75e0666b59f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19a84b98-015f-4e09-bcd7-c5c9e3f7ce0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19a84b98-015f-4e09-bcd7-c5c9e3f7ce0a
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19a84b98-015f-4e09-bcd7-c5c9e3f7ce0a
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
correlation: qa-d1da1bf6-9092-488d-813a-a22b254efffb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1da1bf6-9092-488d-813a-a22b254efffb
Content-Type: application/json

--- request body ---
{"handle":"qa-27eac78f0f33","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1da1bf6-9092-488d-813a-a22b254efffb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1da1bf6-9092-488d-813a-a22b254efffb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1db4e65c-1da8-4e34-9b74-e0d817a06f40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1db4e65c-1da8-4e34-9b74-e0d817a06f40
Content-Type: application/json

--- response: 204 in 40 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1db4e65c-1da8-4e34-9b74-e0d817a06f40
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
correlation: qa-cc52af32-51c5-4a3a-b441-f6b89479e1a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc52af32-51c5-4a3a-b441-f6b89479e1a9
Content-Type: application/json

--- request body ---
{"handle":"qa-34af907d5e9b","password":"****"}

--- response: 401 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc52af32-51c5-4a3a-b441-f6b89479e1a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cc52af32-51c5-4a3a-b441-f6b89479e1a9"}
```
