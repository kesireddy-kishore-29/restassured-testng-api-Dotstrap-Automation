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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-45a22fdc-dd56-4010-9e07-364d4dde5092` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-a34fb71f-e911-4554-af8d-18a8ae8aac97` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-88068ec8-c2c1-4b36-8fc6-2c9202ae81c7` |
| 4 | `POST /v1/credits/purchases` | 201 | 12 | `qa-a8c0cb80-0444-4692-add7-083f6c0e3254` |
| 5 | `POST /v1/credits/purchases` | 201 | 13 | `qa-5c0e9842-4501-42c5-a552-97a97b783efa` |
| 6 | `POST /v1/conversations` | 201 | 7 | `qa-9d491e31-7451-4d90-bd31-4285541f410b` |
| 7 | `GET /v1/credits/ledger` | 200 | 8 | `qa-6e69f39b-7ded-4a08-a149-ac396faab6a0` |
| 8 | `GET /v1/credits/balance` | 200 | 7 | `qa-e08bd415-bb8e-493d-a788-454de095c12b` |
| 9 | `POST /v1/auth/token` | 200 | 16 | `qa-82276a13-f665-429e-aa25-343eb8353169` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-7300a451-3c2c-4df6-ac81-482d348b5a12` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-2dff22f2-3826-42b0-a5b2-64c5518c2c4e` |
| 12 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-9cfc55fc-c616-4aa4-961f-b6f9fcee1682` |
| 13 | `POST /v1/auth/token` | 401 | 9 | `qa-49ce52c6-1a99-4e96-b9c3-f844fee1c41a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-45a22fdc-dd56-4010-9e07-364d4dde5092

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45a22fdc-dd56-4010-9e07-364d4dde5092
Content-Type: application/json

--- request body ---
{"handle":"qa-74328c77c8c0","displayName":"QA 74328c77c8c0","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-45a22fdc-dd56-4010-9e07-364d4dde5092
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
Location: /v1/accounts/qa-74328c77c8c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bdb3a42d-18a3-4981-937d-e9dfe4034e17","handle":"qa-74328c77c8c0","displayName":"QA 74328c77c8c0","region":"eu","role":"user","createdAt":"2026-11-28T10:37:20.742048513Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a34fb71f-e911-4554-af8d-18a8ae8aac97

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a34fb71f-e911-4554-af8d-18a8ae8aac97
Content-Type: application/json

--- request body ---
{"handle":"qa-8669fc8d1c32","displayName":"QA 8669fc8d1c32","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a34fb71f-e911-4554-af8d-18a8ae8aac97
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
Location: /v1/accounts/qa-8669fc8d1c32
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f65ce17-ee2b-4204-987c-f5d204742616","handle":"qa-8669fc8d1c32","displayName":"QA 8669fc8d1c32","region":"eu","role":"user","createdAt":"2026-11-28T10:37:20.796896299Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-88068ec8-c2c1-4b36-8fc6-2c9202ae81c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88068ec8-c2c1-4b36-8fc6-2c9202ae81c7
Content-Type: application/json

--- request body ---
{"handle":"qa-74328c77c8c0","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-88068ec8-c2c1-4b36-8fc6-2c9202ae81c7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bdb3a42d-18a3-4981-937d-e9dfe4034e17"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a8c0cb80-0444-4692-add7-083f6c0e3254

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2af54597ea3a4b8fa531e78be7110a49
X-Correlation-Id: qa-a8c0cb80-0444-4692-add7-083f6c0e3254
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8c0cb80-0444-4692-add7-083f6c0e3254
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
Location: /v1/credits/purchases/pur_65208eeb-3107-4d2c-b404-1030b3e72ff7
Content-Length: 144

{"id":"pur_65208eeb-3107-4d2c-b404-1030b3e72ff7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:20.877645235Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5c0e9842-4501-42c5-a552-97a97b783efa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-48896e12a9534631aec5e93399c8228b
X-Correlation-Id: qa-5c0e9842-4501-42c5-a552-97a97b783efa
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 13 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c0e9842-4501-42c5-a552-97a97b783efa
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
Location: /v1/credits/purchases/pur_0f2f6d06-39b8-4f28-8875-0db8856eddc3
Content-Length: 144

{"id":"pur_0f2f6d06-39b8-4f28-8875-0db8856eddc3","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-28T10:37:20.905150341Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-9d491e31-7451-4d90-bd31-4285541f410b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d491e31-7451-4d90-bd31-4285541f410b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8669fc8d1c32","subject":"Paid message","message":"Hi"}

--- response: 201 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d491e31-7451-4d90-bd31-4285541f410b
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
Location: /v1/conversations/cnv_edbacf73-53c1-42c1-96fd-f42bddc720fa
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_edbacf73-53c1-42c1-96fd-f42bddc720fa","subject":"Paid message","status":"open","region":"eu","participants":["qa-74328c77c8c0","qa-8669fc8d1c32"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:20.923153915Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-6e69f39b-7ded-4a08-a149-ac396faab6a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e69f39b-7ded-4a08-a149-ac396faab6a0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e69f39b-7ded-4a08-a149-ac396faab6a0
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

{"items":[{"id":"led_40693a99-171e-4f3f-91a9-092192f2f0ea","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-28T10:37:20.742064653Z"},{"id":"led_9af3ce3e-f6fd-483c-b7f3-cb3e40ec4c5a","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_65208eeb-3107-4d2c-b404-1030b3e72ff7","createdAt":"2026-11-28T10:37:20.877645235Z"},{"id":"led_ee2c5ae7-cf20-42cd-bacf-c2f27093dfe9","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_0f2f6d06-39b8-4f28-8875-0db8856eddc3","createdAt":"2026-11-28T10:37:20.905150341Z"},{"id":"led_56f48e90-e718-4a78-9915-b66b8d12560a","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_edbacf73-53c1-42c1-96fd-f42bddc720fa","createdAt":"2026-11-28T10:37:20.923119721Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-e08bd415-bb8e-493d-a788-454de095c12b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e08bd415-bb8e-493d-a788-454de095c12b
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e08bd415-bb8e-493d-a788-454de095c12b
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

{"balance":64,"currency":"credits","accountId":"acc_bdb3a42d-18a3-4981-937d-e9dfe4034e17"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-82276a13-f665-429e-aa25-343eb8353169

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82276a13-f665-429e-aa25-343eb8353169
Content-Type: application/json

--- request body ---
{"handle":"qa-8669fc8d1c32","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-82276a13-f665-429e-aa25-343eb8353169
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f65ce17-ee2b-4204-987c-f5d204742616"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7300a451-3c2c-4df6-ac81-482d348b5a12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7300a451-3c2c-4df6-ac81-482d348b5a12
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7300a451-3c2c-4df6-ac81-482d348b5a12
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
correlation: qa-2dff22f2-3826-42b0-a5b2-64c5518c2c4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dff22f2-3826-42b0-a5b2-64c5518c2c4e
Content-Type: application/json

--- request body ---
{"handle":"qa-8669fc8d1c32","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2dff22f2-3826-42b0-a5b2-64c5518c2c4e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2dff22f2-3826-42b0-a5b2-64c5518c2c4e"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9cfc55fc-c616-4aa4-961f-b6f9fcee1682

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cfc55fc-c616-4aa4-961f-b6f9fcee1682
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9cfc55fc-c616-4aa4-961f-b6f9fcee1682
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
correlation: qa-49ce52c6-1a99-4e96-b9c3-f844fee1c41a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49ce52c6-1a99-4e96-b9c3-f844fee1c41a
Content-Type: application/json

--- request body ---
{"handle":"qa-74328c77c8c0","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49ce52c6-1a99-4e96-b9c3-f844fee1c41a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-49ce52c6-1a99-4e96-b9c3-f844fee1c41a"}
```
