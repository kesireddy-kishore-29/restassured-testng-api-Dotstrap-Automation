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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-8cbe27a7-06bc-48fb-b0f4-5112fb02f00e` |
| 2 | `POST /v1/accounts` | 201 | 8 | `qa-dbd0f3ac-806a-4441-8f0c-ade1a65b91c0` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-5571dfed-2735-4cf7-a1db-aa39cd0195de` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-560f3440-7754-4501-b6b2-c092284c8d49` |
| 5 | `POST /v1/credits/purchases` | 415 | 13 | `qa-21c9a02c-272a-43bd-84c0-c01d0287b834` |
| 6 | `POST /v1/auth/token` | 200 | 17 | `qa-31085345-4396-43ef-a5ef-f1b6b9afbc44` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-4bdca4db-247a-42fe-a087-998fcd128cdf` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-6ba0bdc8-50ec-45d3-b97e-a1a49efaff34` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-7c1d779c-a8fd-493f-99eb-3f68e7c3002c` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-63b0e8ab-188f-41f3-9c04-87b67c3b79f0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8cbe27a7-06bc-48fb-b0f4-5112fb02f00e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cbe27a7-06bc-48fb-b0f4-5112fb02f00e
Content-Type: application/json

--- request body ---
{"handle":"qa-71f29741d92c","displayName":"QA 71f29741d92c","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cbe27a7-06bc-48fb-b0f4-5112fb02f00e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Location: /v1/accounts/qa-71f29741d92c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_320fa43b-24e7-4880-95b7-ba735e9cfb36","handle":"qa-71f29741d92c","displayName":"QA 71f29741d92c","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.881494188Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dbd0f3ac-806a-4441-8f0c-ade1a65b91c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbd0f3ac-806a-4441-8f0c-ade1a65b91c0
Content-Type: application/json

--- request body ---
{"handle":"qa-5c7909795cea","displayName":"QA 5c7909795cea","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbd0f3ac-806a-4441-8f0c-ade1a65b91c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 306
RateLimit-Reset: 7
Location: /v1/accounts/qa-5c7909795cea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92f38dd1-51bd-46b3-897a-e163b90a6851","handle":"qa-5c7909795cea","displayName":"QA 5c7909795cea","region":"eu","role":"user","createdAt":"2026-11-24T12:38:15.894584301Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5571dfed-2735-4cf7-a1db-aa39cd0195de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5571dfed-2735-4cf7-a1db-aa39cd0195de
Content-Type: application/json

--- request body ---
{"handle":"qa-71f29741d92c","password":"****"}

--- response: 200 in 19 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-5571dfed-2735-4cf7-a1db-aa39cd0195de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_320fa43b-24e7-4880-95b7-ba735e9cfb36"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-560f3440-7754-4501-b6b2-c092284c8d49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-560f3440-7754-4501-b6b2-c092284c8d49
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5c7909795cea","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-560f3440-7754-4501-b6b2-c092284c8d49
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
Location: /v1/conversations/cnv_67944ab9-e58a-46c0-907f-32a9b5b8078b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_67944ab9-e58a-46c0-907f-32a9b5b8078b","subject":"Error contract","status":"open","region":"eu","participants":["qa-71f29741d92c","qa-5c7909795cea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:15.934794280Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-21c9a02c-272a-43bd-84c0-c01d0287b834

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f58431fca3d9486fba7fde3842266546
X-Correlation-Id: qa-21c9a02c-272a-43bd-84c0-c01d0287b834
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-21c9a02c-272a-43bd-84c0-c01d0287b834
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/credits/purchases","correlationId":"qa-21c9a02c-272a-43bd-84c0-c01d0287b834"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-31085345-4396-43ef-a5ef-f1b6b9afbc44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31085345-4396-43ef-a5ef-f1b6b9afbc44
Content-Type: application/json

--- request body ---
{"handle":"qa-5c7909795cea","password":"****"}

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-31085345-4396-43ef-a5ef-f1b6b9afbc44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92f38dd1-51bd-46b3-897a-e163b90a6851"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4bdca4db-247a-42fe-a087-998fcd128cdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bdca4db-247a-42fe-a087-998fcd128cdf
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4bdca4db-247a-42fe-a087-998fcd128cdf
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
correlation: qa-6ba0bdc8-50ec-45d3-b97e-a1a49efaff34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ba0bdc8-50ec-45d3-b97e-a1a49efaff34
Content-Type: application/json

--- request body ---
{"handle":"qa-5c7909795cea","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ba0bdc8-50ec-45d3-b97e-a1a49efaff34
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 292
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ba0bdc8-50ec-45d3-b97e-a1a49efaff34"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c1d779c-a8fd-493f-99eb-3f68e7c3002c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c1d779c-a8fd-493f-99eb-3f68e7c3002c
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c1d779c-a8fd-493f-99eb-3f68e7c3002c
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
correlation: qa-63b0e8ab-188f-41f3-9c04-87b67c3b79f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63b0e8ab-188f-41f3-9c04-87b67c3b79f0
Content-Type: application/json

--- request body ---
{"handle":"qa-71f29741d92c","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-63b0e8ab-188f-41f3-9c04-87b67c3b79f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-63b0e8ab-188f-41f3-9c04-87b67c3b79f0"}
```
