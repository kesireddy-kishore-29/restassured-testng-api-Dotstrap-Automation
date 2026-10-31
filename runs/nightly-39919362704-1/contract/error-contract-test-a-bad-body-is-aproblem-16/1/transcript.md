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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-dd1da7ff-a36f-4437-a73d-cddc914f882a` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-4395050d-824f-440f-aae4-a4eda462247e` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-37a06ef5-d51a-4a6b-9929-db3cbe9dc142` |
| 4 | `POST /v1/conversations` | 201 | 12 | `qa-60f0909f-541a-47c1-9aeb-41d4b9ff2519` |
| 5 | `POST /v1/credits/purchases` | 415 | 15 | `qa-fd93c827-d42e-478c-84cd-dd194e3f9e81` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-2ad13fa5-c4c9-414b-a708-ea4675f47fe6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-fbdcc54f-c8b8-4e1b-8906-997cd65d206a` |
| 8 | `POST /v1/auth/token` | 401 | 5 | `qa-a670e6e4-8099-47fa-8650-0fc7e10c4626` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f18c2274-7722-4bbd-848e-71752ffba60b` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-2ab62f5a-7794-47ef-a626-7ea4b78134fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dd1da7ff-a36f-4437-a73d-cddc914f882a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd1da7ff-a36f-4437-a73d-cddc914f882a
Content-Type: application/json

--- request body ---
{"handle":"qa-ecc469aae999","displayName":"QA ecc469aae999","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd1da7ff-a36f-4437-a73d-cddc914f882a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Location: /v1/accounts/qa-ecc469aae999
X-Served-Region: eu
Content-Length: 181

{"id":"acc_96f9e273-b42b-4338-bde7-26dfe4d45c5b","handle":"qa-ecc469aae999","displayName":"QA ecc469aae999","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.256333653Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4395050d-824f-440f-aae4-a4eda462247e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4395050d-824f-440f-aae4-a4eda462247e
Content-Type: application/json

--- request body ---
{"handle":"qa-d4dd5d0d980f","displayName":"QA d4dd5d0d980f","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4395050d-824f-440f-aae4-a4eda462247e
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
Location: /v1/accounts/qa-d4dd5d0d980f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff8cc134-eb2f-477b-bdb5-6a8cf58f541d","handle":"qa-d4dd5d0d980f","displayName":"QA d4dd5d0d980f","region":"eu","role":"user","createdAt":"2026-10-23T07:41:47.321906146Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-37a06ef5-d51a-4a6b-9929-db3cbe9dc142

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37a06ef5-d51a-4a6b-9929-db3cbe9dc142
Content-Type: application/json

--- request body ---
{"handle":"qa-ecc469aae999","password":"****"}

--- response: 200 in 23 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-37a06ef5-d51a-4a6b-9929-db3cbe9dc142
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_96f9e273-b42b-4338-bde7-26dfe4d45c5b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-60f0909f-541a-47c1-9aeb-41d4b9ff2519

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60f0909f-541a-47c1-9aeb-41d4b9ff2519
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d4dd5d0d980f","subject":"Error contract","message":"Hi"}

--- response: 201 in 12 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-60f0909f-541a-47c1-9aeb-41d4b9ff2519
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
Location: /v1/conversations/cnv_fadec02f-7fa3-4fd2-89bc-e8087827b048
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fadec02f-7fa3-4fd2-89bc-e8087827b048","subject":"Error contract","status":"open","region":"eu","participants":["qa-ecc469aae999","qa-d4dd5d0d980f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:41:47.371734436Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fd93c827-d42e-478c-84cd-dd194e3f9e81

--- request headers ---
Accept: application/json
Idempotency-Key: qa-40a570c677d24f6dafee60cb58ff7439
X-Correlation-Id: qa-fd93c827-d42e-478c-84cd-dd194e3f9e81
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 15 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd93c827-d42e-478c-84cd-dd194e3f9e81
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-fd93c827-d42e-478c-84cd-dd194e3f9e81"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2ad13fa5-c4c9-414b-a708-ea4675f47fe6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ad13fa5-c4c9-414b-a708-ea4675f47fe6
Content-Type: application/json

--- request body ---
{"handle":"qa-d4dd5d0d980f","password":"****"}

--- response: 200 in 20 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ad13fa5-c4c9-414b-a708-ea4675f47fe6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff8cc134-eb2f-477b-bdb5-6a8cf58f541d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fbdcc54f-c8b8-4e1b-8906-997cd65d206a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbdcc54f-c8b8-4e1b-8906-997cd65d206a
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fbdcc54f-c8b8-4e1b-8906-997cd65d206a
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
correlation: qa-a670e6e4-8099-47fa-8650-0fc7e10c4626

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a670e6e4-8099-47fa-8650-0fc7e10c4626
Content-Type: application/json

--- request body ---
{"handle":"qa-d4dd5d0d980f","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a670e6e4-8099-47fa-8650-0fc7e10c4626
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a670e6e4-8099-47fa-8650-0fc7e10c4626"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f18c2274-7722-4bbd-848e-71752ffba60b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f18c2274-7722-4bbd-848e-71752ffba60b
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f18c2274-7722-4bbd-848e-71752ffba60b
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
correlation: qa-2ab62f5a-7794-47ef-a626-7ea4b78134fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ab62f5a-7794-47ef-a626-7ea4b78134fb
Content-Type: application/json

--- request body ---
{"handle":"qa-ecc469aae999","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 23 Oct 2026 07:41:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2ab62f5a-7794-47ef-a626-7ea4b78134fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2ab62f5a-7794-47ef-a626-7ea4b78134fb"}
```
