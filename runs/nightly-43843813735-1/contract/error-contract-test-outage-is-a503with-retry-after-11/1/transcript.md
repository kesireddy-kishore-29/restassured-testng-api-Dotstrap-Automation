# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-4c8bb28e-9ad2-45af-a979-000381492612` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-6153134e-6117-4ed2-b10d-fa6b6b9deaf6` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-e8f32c7e-e57a-444e-ac55-37bc4b202ea4` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-107eb97e-3727-4007-bb11-707b6ac720f7` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 10 | `qa-fd91264d-228f-4365-b4a5-32bc9b56b7bf` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-954643af-7cf6-4805-8ea3-3da364612bdb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-8a25f151-c4ae-4a3e-812c-d964d73ee93d` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-e2fde1c1-cde9-4c0b-8824-49c92872394b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-e6668061-3c91-4a0a-9e70-6b7aa7a74735` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-57015015-9815-4a52-9bae-2958dec4d9e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4c8bb28e-9ad2-45af-a979-000381492612

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c8bb28e-9ad2-45af-a979-000381492612
Content-Type: application/json

--- request body ---
{"handle":"qa-c0b8c2331456","displayName":"QA c0b8c2331456","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c8bb28e-9ad2-45af-a979-000381492612
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Location: /v1/accounts/qa-c0b8c2331456
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47d3a28d-66fd-4cad-b29a-3926404a5cd7","handle":"qa-c0b8c2331456","displayName":"QA c0b8c2331456","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.705304286Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6153134e-6117-4ed2-b10d-fa6b6b9deaf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6153134e-6117-4ed2-b10d-fa6b6b9deaf6
Content-Type: application/json

--- request body ---
{"handle":"qa-a950a071012e","displayName":"QA a950a071012e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6153134e-6117-4ed2-b10d-fa6b6b9deaf6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 399
RateLimit-Reset: 8
Location: /v1/accounts/qa-a950a071012e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6b5ccbd9-97f5-4d12-a718-67f55becb2d5","handle":"qa-a950a071012e","displayName":"QA a950a071012e","region":"eu","role":"user","createdAt":"2026-11-16T09:53:53.739722985Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e8f32c7e-e57a-444e-ac55-37bc4b202ea4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8f32c7e-e57a-444e-ac55-37bc4b202ea4
Content-Type: application/json

--- request body ---
{"handle":"qa-c0b8c2331456","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8f32c7e-e57a-444e-ac55-37bc4b202ea4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47d3a28d-66fd-4cad-b29a-3926404a5cd7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-107eb97e-3727-4007-bb11-707b6ac720f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-107eb97e-3727-4007-bb11-707b6ac720f7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a950a071012e","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-107eb97e-3727-4007-bb11-707b6ac720f7
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
Location: /v1/conversations/cnv_6aa0ef58-f763-47b5-b5ea-b54fe438f480
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6aa0ef58-f763-47b5-b5ea-b54fe438f480","subject":"Error contract","status":"open","region":"eu","participants":["qa-c0b8c2331456","qa-a950a071012e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:53.791413352Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_6aa0ef58-f763-47b5-b5ea-b54fe438f480/read
correlation: qa-fd91264d-228f-4365-b4a5-32bc9b56b7bf

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b372946b-ed9d-4404-8cef-4ca0d1e1da01
X-Correlation-Id: qa-fd91264d-228f-4365-b4a5-32bc9b56b7bf
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd91264d-228f-4365-b4a5-32bc9b56b7bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_6aa0ef58-f763-47b5-b5ea-b54fe438f480/read","correlationId":"qa-fd91264d-228f-4365-b4a5-32bc9b56b7bf"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-954643af-7cf6-4805-8ea3-3da364612bdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-954643af-7cf6-4805-8ea3-3da364612bdb
Content-Type: application/json

--- request body ---
{"handle":"qa-a950a071012e","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-954643af-7cf6-4805-8ea3-3da364612bdb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b5ccbd9-97f5-4d12-a718-67f55becb2d5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a25f151-c4ae-4a3e-812c-d964d73ee93d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a25f151-c4ae-4a3e-812c-d964d73ee93d
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a25f151-c4ae-4a3e-812c-d964d73ee93d
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
correlation: qa-e2fde1c1-cde9-4c0b-8824-49c92872394b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2fde1c1-cde9-4c0b-8824-49c92872394b
Content-Type: application/json

--- request body ---
{"handle":"qa-a950a071012e","password":"****"}

--- response: 401 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e2fde1c1-cde9-4c0b-8824-49c92872394b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 376
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e2fde1c1-cde9-4c0b-8824-49c92872394b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e6668061-3c91-4a0a-9e70-6b7aa7a74735

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6668061-3c91-4a0a-9e70-6b7aa7a74735
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e6668061-3c91-4a0a-9e70-6b7aa7a74735
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
correlation: qa-57015015-9815-4a52-9bae-2958dec4d9e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57015015-9815-4a52-9bae-2958dec4d9e6
Content-Type: application/json

--- request body ---
{"handle":"qa-c0b8c2331456","password":"****"}

--- response: 401 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57015015-9815-4a52-9bae-2958dec4d9e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 368
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57015015-9815-4a52-9bae-2958dec4d9e6"}
```
