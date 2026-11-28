# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-6d4117c9-68be-4d5d-8b92-c72dd436db0d` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-a71b29ce-afbe-424d-8c1a-111a7f361180` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-8f3abb71-7fa7-43a0-9260-99b5efa9e6fd` |
| 4 | `POST /v1/credits/purchases` | 201 | 16 | `qa-39c21716-d325-489e-babd-7999f46fe1b9` |
| 5 | `POST /v1/credits/purchases` | 201 | 19 | `qa-4373697e-79be-4830-aa6a-347de82193a8` |
| 6 | `POST /v1/conversations` | 201 | 9 | `qa-74989ce7-be8c-4451-b282-768977af2f9e` |
| 7 | `GET /v1/credits/ledger` | 200 | 13 | `qa-612be2e0-0e58-44d1-8183-9e126a499828` |
| 8 | `GET /v1/credits/balance` | 200 | 14 | `qa-77e77403-6001-4dbf-8e9b-4a04ca46495b` |
| 9 | `POST /v1/auth/token` | 200 | 14 | `qa-0428104b-6d4d-48c0-9ea7-05e7e163f893` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-48ae654b-bc8d-4b07-81e3-14bb8e53ed61` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-a1af3d14-e4d9-49f0-9c47-dadeeedd0f8b` |
| 12 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-1e716a4e-fd08-48f3-9968-328f5d0cd3f4` |
| 13 | `POST /v1/auth/token` | 401 | 12 | `qa-0119e051-1721-4534-a453-0dbc9d2314a2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6d4117c9-68be-4d5d-8b92-c72dd436db0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d4117c9-68be-4d5d-8b92-c72dd436db0d
Content-Type: application/json

--- request body ---
{"handle":"qa-bb44e881e5be","displayName":"QA bb44e881e5be","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d4117c9-68be-4d5d-8b92-c72dd436db0d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-bb44e881e5be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fdf2cb4b-bca4-4d3e-9aba-e923dc12c94f","handle":"qa-bb44e881e5be","displayName":"QA bb44e881e5be","region":"eu","role":"user","createdAt":"2026-11-22T09:54:49.622454804Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a71b29ce-afbe-424d-8c1a-111a7f361180

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a71b29ce-afbe-424d-8c1a-111a7f361180
Content-Type: application/json

--- request body ---
{"handle":"qa-52ed421167ab","displayName":"QA 52ed421167ab","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-a71b29ce-afbe-424d-8c1a-111a7f361180
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-52ed421167ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_23575779-afe2-4cca-b372-984bfb37e74d","handle":"qa-52ed421167ab","displayName":"QA 52ed421167ab","region":"eu","role":"user","createdAt":"2026-11-22T09:54:49.669929782Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f3abb71-7fa7-43a0-9260-99b5efa9e6fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f3abb71-7fa7-43a0-9260-99b5efa9e6fd
Content-Type: application/json

--- request body ---
{"handle":"qa-bb44e881e5be","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f3abb71-7fa7-43a0-9260-99b5efa9e6fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdf2cb4b-bca4-4d3e-9aba-e923dc12c94f"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-39c21716-d325-489e-babd-7999f46fe1b9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-c6a4cf5516eb4a7db8014a42dfdec254
X-Correlation-Id: qa-39c21716-d325-489e-babd-7999f46fe1b9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-39c21716-d325-489e-babd-7999f46fe1b9
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
Location: /v1/credits/purchases/pur_b011c4df-c05d-4523-a2c1-d67c86687062
Content-Length: 144

{"id":"pur_b011c4df-c05d-4523-a2c1-d67c86687062","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-22T09:54:49.744772415Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4373697e-79be-4830-aa6a-347de82193a8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-00da0614d3824d28a8e829bdc87927eb
X-Correlation-Id: qa-4373697e-79be-4830-aa6a-347de82193a8
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4373697e-79be-4830-aa6a-347de82193a8
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
Location: /v1/credits/purchases/pur_de6945e0-ed6c-427e-8620-979da0c54f08
Content-Length: 144

{"id":"pur_de6945e0-ed6c-427e-8620-979da0c54f08","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-22T09:54:49.779415989Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-74989ce7-be8c-4451-b282-768977af2f9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74989ce7-be8c-4451-b282-768977af2f9e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-52ed421167ab","subject":"Paid message","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-74989ce7-be8c-4451-b282-768977af2f9e
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
Location: /v1/conversations/cnv_b3ea6bec-6b45-4d00-ade0-ed4961fbe623
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_b3ea6bec-6b45-4d00-ade0-ed4961fbe623","subject":"Paid message","status":"open","region":"eu","participants":["qa-bb44e881e5be","qa-52ed421167ab"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:49.811636728Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-612be2e0-0e58-44d1-8183-9e126a499828

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-612be2e0-0e58-44d1-8183-9e126a499828
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-612be2e0-0e58-44d1-8183-9e126a499828
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 791

{"items":[{"id":"led_b6a95f68-ee7f-4554-bd6d-c75ec97d3792","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-22T09:54:49.622465724Z"},{"id":"led_cf370f0b-802a-4560-af04-1a7394753085","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_b011c4df-c05d-4523-a2c1-d67c86687062","createdAt":"2026-11-22T09:54:49.744772415Z"},{"id":"led_58ac013a-4d82-4454-8293-a905e10cb8ee","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_de6945e0-ed6c-427e-8620-979da0c54f08","createdAt":"2026-11-22T09:54:49.779415989Z"},{"id":"led_fd6eb56a-7cd7-4955-aff1-c799caa37f81","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_b3ea6bec-6b45-4d00-ade0-ed4961fbe623","createdAt":"2026-11-22T09:54:49.811601221Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-77e77403-6001-4dbf-8e9b-4a04ca46495b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77e77403-6001-4dbf-8e9b-4a04ca46495b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-77e77403-6001-4dbf-8e9b-4a04ca46495b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_fdf2cb4b-bca4-4d3e-9aba-e923dc12c94f"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-0428104b-6d4d-48c0-9ea7-05e7e163f893

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0428104b-6d4d-48c0-9ea7-05e7e163f893
Content-Type: application/json

--- request body ---
{"handle":"qa-52ed421167ab","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-0428104b-6d4d-48c0-9ea7-05e7e163f893
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23575779-afe2-4cca-b372-984bfb37e74d"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-48ae654b-bc8d-4b07-81e3-14bb8e53ed61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48ae654b-bc8d-4b07-81e3-14bb8e53ed61
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-48ae654b-bc8d-4b07-81e3-14bb8e53ed61
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-a1af3d14-e4d9-49f0-9c47-dadeeedd0f8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1af3d14-e4d9-49f0-9c47-dadeeedd0f8b
Content-Type: application/json

--- request body ---
{"handle":"qa-52ed421167ab","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1af3d14-e4d9-49f0-9c47-dadeeedd0f8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1af3d14-e4d9-49f0-9c47-dadeeedd0f8b"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1e716a4e-fd08-48f3-9968-328f5d0cd3f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e716a4e-fd08-48f3-9968-328f5d0cd3f4
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1e716a4e-fd08-48f3-9968-328f5d0cd3f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-0119e051-1721-4534-a453-0dbc9d2314a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0119e051-1721-4534-a453-0dbc9d2314a2
Content-Type: application/json

--- request body ---
{"handle":"qa-bb44e881e5be","password":"****"}

--- response: 401 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0119e051-1721-4534-a453-0dbc9d2314a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0119e051-1721-4534-a453-0dbc9d2314a2"}
```
