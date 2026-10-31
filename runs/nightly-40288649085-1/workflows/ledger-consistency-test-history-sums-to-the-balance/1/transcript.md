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
| 1 | `POST /v1/accounts` | 201 | 463 | `qa-428dfb4d-7a24-41d8-b8ba-15ceb6892b57` |
| 2 | `POST /v1/accounts` | 201 | 70 | `qa-8274ed07-ed8c-490c-bcf0-1e18606046b8` |
| 3 | `POST /v1/auth/token` | 200 | 40 | `qa-bf499843-a876-4d1f-81c5-df7aee62be47` |
| 4 | `POST /v1/credits/purchases` | 201 | 89 | `qa-112518a8-b590-4869-b425-ee8d21bac7d3` |
| 5 | `POST /v1/credits/purchases` | 201 | 10 | `qa-f8c7ae71-417a-41fe-b437-833c39c53f6b` |
| 6 | `POST /v1/conversations` | 201 | 25 | `qa-9c2155d8-839c-4184-b36b-54eb1d383679` |
| 7 | `GET /v1/credits/ledger` | 200 | 52 | `qa-cd172ef7-1de1-424e-99a6-bb22ceb6603f` |
| 8 | `GET /v1/credits/balance` | 200 | 22 | `qa-3c53141b-f2e2-4682-a8e9-6cb73f3c2c5c` |
| 9 | `POST /v1/auth/token` | 200 | 16 | `qa-8fa40867-3fe6-4b1e-8983-4f55f47b06a4` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-9a8d6a0c-4c2b-4a19-ae9a-92d6209675d3` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-ee3c93f1-8899-4564-8f02-95e5e3083296` |
| 12 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-89af6566-dd12-4698-91b5-894e12179fba` |
| 13 | `POST /v1/auth/token` | 401 | 15 | `qa-e62b8cad-d904-4ee6-8239-56662522936f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-428dfb4d-7a24-41d8-b8ba-15ceb6892b57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-428dfb4d-7a24-41d8-b8ba-15ceb6892b57
Content-Type: application/json

--- request body ---
{"handle":"qa-a52f5971415c","displayName":"QA a52f5971415c","password":"****","region":"eu"}

--- response: 201 in 463 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-428dfb4d-7a24-41d8-b8ba-15ceb6892b57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-a52f5971415c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fae018e6-6e0c-4eb9-8a73-e0c3f41a6adf","handle":"qa-a52f5971415c","displayName":"QA a52f5971415c","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.454733574Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8274ed07-ed8c-490c-bcf0-1e18606046b8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8274ed07-ed8c-490c-bcf0-1e18606046b8
Content-Type: application/json

--- request body ---
{"handle":"qa-57ae79e9914c","displayName":"QA 57ae79e9914c","password":"****","region":"eu"}

--- response: 201 in 70 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-8274ed07-ed8c-490c-bcf0-1e18606046b8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Location: /v1/accounts/qa-57ae79e9914c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cb0fdcc9-9571-48c6-a9f7-372e4cdd85f2","handle":"qa-57ae79e9914c","displayName":"QA 57ae79e9914c","region":"eu","role":"user","createdAt":"2026-10-26T07:54:47.880102824Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-bf499843-a876-4d1f-81c5-df7aee62be47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf499843-a876-4d1f-81c5-df7aee62be47
Content-Type: application/json

--- request body ---
{"handle":"qa-a52f5971415c","password":"****"}

--- response: 200 in 40 ms ---
Date: Mon, 26 Oct 2026 07:54:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf499843-a876-4d1f-81c5-df7aee62be47
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fae018e6-6e0c-4eb9-8a73-e0c3f41a6adf"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-112518a8-b590-4869-b425-ee8d21bac7d3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d27a4f37e93e44fc9fb3512945754fae
X-Correlation-Id: qa-112518a8-b590-4869-b425-ee8d21bac7d3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 89 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-112518a8-b590-4869-b425-ee8d21bac7d3
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
Location: /v1/credits/purchases/pur_609081d1-f55e-40d4-8381-b6d3f025ae6d
Content-Length: 144

{"id":"pur_609081d1-f55e-40d4-8381-b6d3f025ae6d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-26T07:54:48.092847293Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-f8c7ae71-417a-41fe-b437-833c39c53f6b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9e25b4ae6cfd43e7b98286a1d5b9c820
X-Correlation-Id: qa-f8c7ae71-417a-41fe-b437-833c39c53f6b
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 10 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8c7ae71-417a-41fe-b437-833c39c53f6b
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
Location: /v1/credits/purchases/pur_4bb99f64-b5aa-42c7-937c-f84d37cba264
Content-Length: 144

{"id":"pur_4bb99f64-b5aa-42c7-937c-f84d37cba264","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-26T07:54:48.143668569Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-9c2155d8-839c-4184-b36b-54eb1d383679

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c2155d8-839c-4184-b36b-54eb1d383679
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-57ae79e9914c","subject":"Paid message","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c2155d8-839c-4184-b36b-54eb1d383679
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
Location: /v1/conversations/cnv_193eb117-d3fd-4669-b6ff-740371efa2da
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_193eb117-d3fd-4669-b6ff-740371efa2da","subject":"Paid message","status":"open","region":"eu","participants":["qa-a52f5971415c","qa-57ae79e9914c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:48.180954170Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-cd172ef7-1de1-424e-99a6-bb22ceb6603f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd172ef7-1de1-424e-99a6-bb22ceb6603f
Content-Type: application/json

--- response: 200 in 52 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd172ef7-1de1-424e-99a6-bb22ceb6603f
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

{"items":[{"id":"led_ad59833f-ef3c-4634-95d1-6bc8915dfa53","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-26T07:54:47.455043614Z"},{"id":"led_88457a43-ee5d-4f61-8ff5-a543d17c8b20","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_609081d1-f55e-40d4-8381-b6d3f025ae6d","createdAt":"2026-10-26T07:54:48.092847293Z"},{"id":"led_66dff05f-b087-4f3c-a1d4-8887d7d8d2c2","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_4bb99f64-b5aa-42c7-937c-f84d37cba264","createdAt":"2026-10-26T07:54:48.143668569Z"},{"id":"led_0d713a4a-739c-49b9-82bc-340d6ff22673","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_193eb117-d3fd-4669-b6ff-740371efa2da","createdAt":"2026-10-26T07:54:48.180912842Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-3c53141b-f2e2-4682-a8e9-6cb73f3c2c5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c53141b-f2e2-4682-a8e9-6cb73f3c2c5c
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c53141b-f2e2-4682-a8e9-6cb73f3c2c5c
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

{"balance":64,"currency":"credits","accountId":"acc_fae018e6-6e0c-4eb9-8a73-e0c3f41a6adf"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8fa40867-3fe6-4b1e-8983-4f55f47b06a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8fa40867-3fe6-4b1e-8983-4f55f47b06a4
Content-Type: application/json

--- request body ---
{"handle":"qa-57ae79e9914c","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-8fa40867-3fe6-4b1e-8983-4f55f47b06a4
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cb0fdcc9-9571-48c6-a9f7-372e4cdd85f2"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9a8d6a0c-4c2b-4a19-ae9a-92d6209675d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a8d6a0c-4c2b-4a19-ae9a-92d6209675d3
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9a8d6a0c-4c2b-4a19-ae9a-92d6209675d3
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
correlation: qa-ee3c93f1-8899-4564-8f02-95e5e3083296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee3c93f1-8899-4564-8f02-95e5e3083296
Content-Type: application/json

--- request body ---
{"handle":"qa-57ae79e9914c","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee3c93f1-8899-4564-8f02-95e5e3083296
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee3c93f1-8899-4564-8f02-95e5e3083296"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-89af6566-dd12-4698-91b5-894e12179fba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89af6566-dd12-4698-91b5-894e12179fba
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-89af6566-dd12-4698-91b5-894e12179fba
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
correlation: qa-e62b8cad-d904-4ee6-8239-56662522936f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e62b8cad-d904-4ee6-8239-56662522936f
Content-Type: application/json

--- request body ---
{"handle":"qa-a52f5971415c","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 26 Oct 2026 07:54:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e62b8cad-d904-4ee6-8239-56662522936f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e62b8cad-d904-4ee6-8239-56662522936f"}
```
