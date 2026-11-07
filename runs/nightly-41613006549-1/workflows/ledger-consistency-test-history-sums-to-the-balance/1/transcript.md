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
| 1 | `POST /v1/accounts` | 201 | 300 | `qa-41873352-53c6-4332-9d6b-911f4435b8c9` |
| 2 | `POST /v1/accounts` | 201 | 71 | `qa-990ee9b1-d8a6-4ea9-aad6-044a6e99b1e6` |
| 3 | `POST /v1/auth/token` | 200 | 22 | `qa-1c0b4683-dcd4-4d85-a48c-c1f85bb7d2df` |
| 4 | `POST /v1/credits/purchases` | 201 | 20 | `qa-689e07f8-f513-4d8e-8e1c-6747eb8f5a52` |
| 5 | `POST /v1/credits/purchases` | 201 | 35 | `qa-acf13215-990f-4713-bf46-74558a36b8d6` |
| 6 | `POST /v1/conversations` | 201 | 13 | `qa-bba6f4c3-360a-4922-ad85-c4e160ec0198` |
| 7 | `GET /v1/credits/ledger` | 200 | 9 | `qa-ff7c83de-cc40-4ab7-84ca-6880edc2f63b` |
| 8 | `GET /v1/credits/balance` | 200 | 20 | `qa-9d17560b-ea24-4f15-a3bd-ea9676f9d7eb` |
| 9 | `POST /v1/auth/token` | 200 | 10 | `qa-577163ae-77d1-4e9d-b498-6703cc7b83cd` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-905e6d3a-925c-4b92-85ca-84e51ff3927c` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-4c03d47b-f759-49a9-9fb7-8281b6522fd9` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f8199dc6-2e5c-45fa-86e5-33a6635715d2` |
| 13 | `POST /v1/auth/token` | 401 | 7 | `qa-e614291a-707c-4c80-9a8a-39ef972229df` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-41873352-53c6-4332-9d6b-911f4435b8c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41873352-53c6-4332-9d6b-911f4435b8c9
Content-Type: application/json

--- request body ---
{"handle":"qa-85a7f1368b3f","displayName":"QA 85a7f1368b3f","password":"****","region":"eu"}

--- response: 201 in 300 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-41873352-53c6-4332-9d6b-911f4435b8c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-85a7f1368b3f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f579f568-e2dd-4ee5-a969-f37055926142","handle":"qa-85a7f1368b3f","displayName":"QA 85a7f1368b3f","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.453051949Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-990ee9b1-d8a6-4ea9-aad6-044a6e99b1e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-990ee9b1-d8a6-4ea9-aad6-044a6e99b1e6
Content-Type: application/json

--- request body ---
{"handle":"qa-e4d2e215d033","displayName":"QA e4d2e215d033","password":"****","region":"eu"}

--- response: 201 in 71 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-990ee9b1-d8a6-4ea9-aad6-044a6e99b1e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Location: /v1/accounts/qa-e4d2e215d033
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ad53253c-800c-41c1-854d-90ddeffbf40c","handle":"qa-e4d2e215d033","displayName":"QA e4d2e215d033","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.802220297Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1c0b4683-dcd4-4d85-a48c-c1f85bb7d2df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c0b4683-dcd4-4d85-a48c-c1f85bb7d2df
Content-Type: application/json

--- request body ---
{"handle":"qa-85a7f1368b3f","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-1c0b4683-dcd4-4d85-a48c-c1f85bb7d2df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f579f568-e2dd-4ee5-a969-f37055926142"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-689e07f8-f513-4d8e-8e1c-6747eb8f5a52

--- request headers ---
Accept: application/json
Idempotency-Key: qa-bd22d24ea76a4994b61b613458261975
X-Correlation-Id: qa-689e07f8-f513-4d8e-8e1c-6747eb8f5a52
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-689e07f8-f513-4d8e-8e1c-6747eb8f5a52
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
Location: /v1/credits/purchases/pur_73d418d2-0809-4e85-b076-64672d65e19c
Content-Length: 144

{"id":"pur_73d418d2-0809-4e85-b076-64672d65e19c","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-03T09:41:33.926690360Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-acf13215-990f-4713-bf46-74558a36b8d6

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e779df6d36c8406e809b4f7c4b3bef12
X-Correlation-Id: qa-acf13215-990f-4713-bf46-74558a36b8d6
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 35 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-acf13215-990f-4713-bf46-74558a36b8d6
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
Location: /v1/credits/purchases/pur_f6d14604-ee51-4b5a-81d3-3d020da5e84b
Content-Length: 144

{"id":"pur_f6d14604-ee51-4b5a-81d3-3d020da5e84b","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-03T09:41:33.972844916Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-bba6f4c3-360a-4922-ad85-c4e160ec0198

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bba6f4c3-360a-4922-ad85-c4e160ec0198
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e4d2e215d033","subject":"Paid message","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-bba6f4c3-360a-4922-ad85-c4e160ec0198
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
Location: /v1/conversations/cnv_2d67282d-b02c-42ea-bc31-5fce549e0521
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_2d67282d-b02c-42ea-bc31-5fce549e0521","subject":"Paid message","status":"open","region":"eu","participants":["qa-85a7f1368b3f","qa-e4d2e215d033"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:34.012128604Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ff7c83de-cc40-4ab7-84ca-6880edc2f63b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff7c83de-cc40-4ab7-84ca-6880edc2f63b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff7c83de-cc40-4ab7-84ca-6880edc2f63b
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

{"items":[{"id":"led_51062b5b-b4af-487a-9c3c-c8f8b3e7f9fc","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-03T09:41:33.453061143Z"},{"id":"led_810f4915-439c-4cf7-ad69-b57f163d023e","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_73d418d2-0809-4e85-b076-64672d65e19c","createdAt":"2026-11-03T09:41:33.926690360Z"},{"id":"led_7bb5a80e-811a-47ef-a068-cb943364d6cc","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_f6d14604-ee51-4b5a-81d3-3d020da5e84b","createdAt":"2026-11-03T09:41:33.972844916Z"},{"id":"led_0c249d1f-0745-41f6-b9c4-7fc80d1ca838","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_2d67282d-b02c-42ea-bc31-5fce549e0521","createdAt":"2026-11-03T09:41:34.012116746Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-9d17560b-ea24-4f15-a3bd-ea9676f9d7eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d17560b-ea24-4f15-a3bd-ea9676f9d7eb
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d17560b-ea24-4f15-a3bd-ea9676f9d7eb
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

{"balance":64,"currency":"credits","accountId":"acc_f579f568-e2dd-4ee5-a969-f37055926142"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-577163ae-77d1-4e9d-b498-6703cc7b83cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577163ae-77d1-4e9d-b498-6703cc7b83cd
Content-Type: application/json

--- request body ---
{"handle":"qa-e4d2e215d033","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-577163ae-77d1-4e9d-b498-6703cc7b83cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ad53253c-800c-41c1-854d-90ddeffbf40c"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-905e6d3a-925c-4b92-85ca-84e51ff3927c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-905e6d3a-925c-4b92-85ca-84e51ff3927c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-905e6d3a-925c-4b92-85ca-84e51ff3927c
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
correlation: qa-4c03d47b-f759-49a9-9fb7-8281b6522fd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c03d47b-f759-49a9-9fb7-8281b6522fd9
Content-Type: application/json

--- request body ---
{"handle":"qa-e4d2e215d033","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c03d47b-f759-49a9-9fb7-8281b6522fd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c03d47b-f759-49a9-9fb7-8281b6522fd9"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f8199dc6-2e5c-45fa-86e5-33a6635715d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8199dc6-2e5c-45fa-86e5-33a6635715d2
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f8199dc6-2e5c-45fa-86e5-33a6635715d2
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
correlation: qa-e614291a-707c-4c80-9a8a-39ef972229df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e614291a-707c-4c80-9a8a-39ef972229df
Content-Type: application/json

--- request body ---
{"handle":"qa-85a7f1368b3f","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e614291a-707c-4c80-9a8a-39ef972229df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e614291a-707c-4c80-9a8a-39ef972229df"}
```
