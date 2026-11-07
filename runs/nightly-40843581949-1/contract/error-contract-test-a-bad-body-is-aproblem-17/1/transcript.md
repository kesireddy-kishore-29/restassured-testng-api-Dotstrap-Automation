# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-07e5fa77-5a98-451f-8ec0-bf066f3553e7` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-035db234-703e-4572-8aaf-ad449af06993` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-a48759f8-1166-42c3-9e0f-64acbb24f569` |
| 4 | `POST /v1/conversations` | 201 | 7 | `qa-5fd63cb6-537f-43fc-890e-26a67678854f` |
| 5 | `POST /v1/credits/purchases` | 422 | 12 | `qa-9e12b0ee-b3ec-419f-bf99-c51e91e65bde` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-a8b1fe40-ea2c-4b2f-ae02-77e585548564` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5e599459-bd49-41f1-b292-d589f02d705f` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-4fa9c6f5-01e3-4b43-8eaf-f9cbdb988e58` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-0c462ec7-2149-4313-8329-4b92929b5c1b` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-a1d323db-9f2f-4c1e-ac33-a6781413ac6e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-07e5fa77-5a98-451f-8ec0-bf066f3553e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07e5fa77-5a98-451f-8ec0-bf066f3553e7
Content-Type: application/json

--- request body ---
{"handle":"qa-d69a7a750f89","displayName":"QA d69a7a750f89","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-07e5fa77-5a98-451f-8ec0-bf066f3553e7
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
Location: /v1/accounts/qa-d69a7a750f89
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6bbe7094-6c4a-47c7-b602-d512cb87b70e","handle":"qa-d69a7a750f89","displayName":"QA d69a7a750f89","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.422156159Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-035db234-703e-4572-8aaf-ad449af06993

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-035db234-703e-4572-8aaf-ad449af06993
Content-Type: application/json

--- request body ---
{"handle":"qa-1845578594e0","displayName":"QA 1845578594e0","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-035db234-703e-4572-8aaf-ad449af06993
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 7
Location: /v1/accounts/qa-1845578594e0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9537384b-ed41-466e-8277-8f55613963d2","handle":"qa-1845578594e0","displayName":"QA 1845578594e0","region":"eu","role":"user","createdAt":"2026-10-29T08:39:01.452832781Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a48759f8-1166-42c3-9e0f-64acbb24f569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a48759f8-1166-42c3-9e0f-64acbb24f569
Content-Type: application/json

--- request body ---
{"handle":"qa-d69a7a750f89","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a48759f8-1166-42c3-9e0f-64acbb24f569
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6bbe7094-6c4a-47c7-b602-d512cb87b70e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5fd63cb6-537f-43fc-890e-26a67678854f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5fd63cb6-537f-43fc-890e-26a67678854f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1845578594e0","subject":"Error contract","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-5fd63cb6-537f-43fc-890e-26a67678854f
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
Location: /v1/conversations/cnv_b5c60fd5-c3ac-42f3-a4fe-f9087a05d090
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b5c60fd5-c3ac-42f3-a4fe-f9087a05d090","subject":"Error contract","status":"open","region":"eu","participants":["qa-d69a7a750f89","qa-1845578594e0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:39:01.489888709Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9e12b0ee-b3ec-419f-bf99-c51e91e65bde

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2b73b008adfe4f1e80ee876e224ac5b7
X-Correlation-Id: qa-9e12b0ee-b3ec-419f-bf99-c51e91e65bde
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 12 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e12b0ee-b3ec-419f-bf99-c51e91e65bde
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-9e12b0ee-b3ec-419f-bf99-c51e91e65bde","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a8b1fe40-ea2c-4b2f-ae02-77e585548564

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8b1fe40-ea2c-4b2f-ae02-77e585548564
Content-Type: application/json

--- request body ---
{"handle":"qa-1845578594e0","password":"****"}

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8b1fe40-ea2c-4b2f-ae02-77e585548564
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9537384b-ed41-466e-8277-8f55613963d2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e599459-bd49-41f1-b292-d589f02d705f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e599459-bd49-41f1-b292-d589f02d705f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e599459-bd49-41f1-b292-d589f02d705f
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
correlation: qa-4fa9c6f5-01e3-4b43-8eaf-f9cbdb988e58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4fa9c6f5-01e3-4b43-8eaf-f9cbdb988e58
Content-Type: application/json

--- request body ---
{"handle":"qa-1845578594e0","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4fa9c6f5-01e3-4b43-8eaf-f9cbdb988e58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4fa9c6f5-01e3-4b43-8eaf-f9cbdb988e58"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c462ec7-2149-4313-8329-4b92929b5c1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c462ec7-2149-4313-8329-4b92929b5c1b
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c462ec7-2149-4313-8329-4b92929b5c1b
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
correlation: qa-a1d323db-9f2f-4c1e-ac33-a6781413ac6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1d323db-9f2f-4c1e-ac33-a6781413ac6e
Content-Type: application/json

--- request body ---
{"handle":"qa-d69a7a750f89","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 29 Oct 2026 08:39:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1d323db-9f2f-4c1e-ac33-a6781413ac6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1d323db-9f2f-4c1e-ac33-a6781413ac6e"}
```
