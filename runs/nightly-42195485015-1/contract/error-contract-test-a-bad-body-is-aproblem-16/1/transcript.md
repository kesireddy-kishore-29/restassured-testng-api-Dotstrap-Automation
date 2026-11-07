# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[16]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-5d26266a-16f2-4406-8a3b-44f9efaaba5c` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-f47e4c8b-dc4c-49b8-9661-18165136b4f3` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-fbb190d0-d9af-4dc7-8086-b9da0c62a776` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-f74ab1b0-1933-45a7-aeae-ba623765c887` |
| 5 | `POST /v1/credits/purchases` | 415 | 36 | `qa-866c9ea0-7bd6-41ed-93ec-9d7f3e9c63ac` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-1cd7d61f-189c-4323-a392-7f48f0d08a50` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-17c58e3e-9c76-4fd6-9201-edd156a61629` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-c709e214-c1a1-4d5b-8b75-8b6e204e9471` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-a5a06006-3497-4c40-9544-d2d81309126e` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-2c884b86-018f-4c7c-94b5-f9ba7cc68fac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5d26266a-16f2-4406-8a3b-44f9efaaba5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d26266a-16f2-4406-8a3b-44f9efaaba5c
Content-Type: application/json

--- request body ---
{"handle":"qa-f71f45af4f54","displayName":"QA f71f45af4f54","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d26266a-16f2-4406-8a3b-44f9efaaba5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Location: /v1/accounts/qa-f71f45af4f54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d0ec004-4978-485e-91f1-949ca01b5d23","handle":"qa-f71f45af4f54","displayName":"QA f71f45af4f54","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.637066426Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f47e4c8b-dc4c-49b8-9661-18165136b4f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f47e4c8b-dc4c-49b8-9661-18165136b4f3
Content-Type: application/json

--- request body ---
{"handle":"qa-ed0c69a78ecd","displayName":"QA ed0c69a78ecd","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f47e4c8b-dc4c-49b8-9661-18165136b4f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 6
Location: /v1/accounts/qa-ed0c69a78ecd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ca163ebe-e590-42c5-be17-1c490872c056","handle":"qa-ed0c69a78ecd","displayName":"QA ed0c69a78ecd","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.689583496Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fbb190d0-d9af-4dc7-8086-b9da0c62a776

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbb190d0-d9af-4dc7-8086-b9da0c62a776
Content-Type: application/json

--- request body ---
{"handle":"qa-f71f45af4f54","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbb190d0-d9af-4dc7-8086-b9da0c62a776
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 313
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d0ec004-4978-485e-91f1-949ca01b5d23"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f74ab1b0-1933-45a7-aeae-ba623765c887

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f74ab1b0-1933-45a7-aeae-ba623765c887
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ed0c69a78ecd","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f74ab1b0-1933-45a7-aeae-ba623765c887
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
Location: /v1/conversations/cnv_ded622d0-aa31-4652-b0e6-476ca1695685
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ded622d0-aa31-4652-b0e6-476ca1695685","subject":"Error contract","status":"open","region":"eu","participants":["qa-f71f45af4f54","qa-ed0c69a78ecd"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.786088255Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-866c9ea0-7bd6-41ed-93ec-9d7f3e9c63ac

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2b72bcdd1b474f6cbc3ca38ad51ce571
X-Correlation-Id: qa-866c9ea0-7bd6-41ed-93ec-9d7f3e9c63ac
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-866c9ea0-7bd6-41ed-93ec-9d7f3e9c63ac
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
Content-Length: 261

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-866c9ea0-7bd6-41ed-93ec-9d7f3e9c63ac"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1cd7d61f-189c-4323-a392-7f48f0d08a50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cd7d61f-189c-4323-a392-7f48f0d08a50
Content-Type: application/json

--- request body ---
{"handle":"qa-ed0c69a78ecd","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cd7d61f-189c-4323-a392-7f48f0d08a50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ca163ebe-e590-42c5-be17-1c490872c056"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-17c58e3e-9c76-4fd6-9201-edd156a61629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17c58e3e-9c76-4fd6-9201-edd156a61629
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-17c58e3e-9c76-4fd6-9201-edd156a61629
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
correlation: qa-c709e214-c1a1-4d5b-8b75-8b6e204e9471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c709e214-c1a1-4d5b-8b75-8b6e204e9471
Content-Type: application/json

--- request body ---
{"handle":"qa-ed0c69a78ecd","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c709e214-c1a1-4d5b-8b75-8b6e204e9471
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c709e214-c1a1-4d5b-8b75-8b6e204e9471"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5a06006-3497-4c40-9544-d2d81309126e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5a06006-3497-4c40-9544-d2d81309126e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5a06006-3497-4c40-9544-d2d81309126e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-2c884b86-018f-4c7c-94b5-f9ba7cc68fac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c884b86-018f-4c7c-94b5-f9ba7cc68fac
Content-Type: application/json

--- request body ---
{"handle":"qa-f71f45af4f54","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c884b86-018f-4c7c-94b5-f9ba7cc68fac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2c884b86-018f-4c7c-94b5-f9ba7cc68fac"}
```
