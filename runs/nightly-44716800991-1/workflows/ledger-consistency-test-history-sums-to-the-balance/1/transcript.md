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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-6b4232c9-279d-4847-ba7a-ca4ab4bd76c7` |
| 2 | `POST /v1/accounts` | 201 | 83 | `qa-74b744ce-20dd-4136-a84e-b28f2f6e682e` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-0ce15236-be54-4356-8cdc-754c5ef24f4e` |
| 4 | `POST /v1/credits/purchases` | 201 | 9 | `qa-cc863b90-76cf-427a-80b4-95984c0946f3` |
| 5 | `POST /v1/credits/purchases` | 201 | 25 | `qa-392f8195-70f0-42ff-9875-bdd12dbf2bbf` |
| 6 | `POST /v1/conversations` | 201 | 18 | `qa-064ec5d0-14ec-435f-bee8-2c65e11e603b` |
| 7 | `GET /v1/credits/ledger` | 200 | 12 | `qa-319ab9f7-1c6f-4eb4-bcca-170d094295b6` |
| 8 | `GET /v1/credits/balance` | 200 | 42 | `qa-97833d3e-3733-4276-8ea8-631f008f7f94` |
| 9 | `POST /v1/auth/token` | 200 | 24 | `qa-8b7657f0-1bbc-4651-8873-94ac09ca0349` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-876f9b46-756f-4447-afde-75d7cd39318d` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-c9d20565-0eed-4867-8968-f2a486bbf3ca` |
| 12 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-50832383-7abf-4581-acc3-fb7b360b41f3` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-70ca4ab5-308c-4b7b-bcd2-24f28f66149b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b4232c9-279d-4847-ba7a-ca4ab4bd76c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b4232c9-279d-4847-ba7a-ca4ab4bd76c7
Content-Type: application/json

--- request body ---
{"handle":"qa-c046c0728f2d","displayName":"QA c046c0728f2d","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b4232c9-279d-4847-ba7a-ca4ab4bd76c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-c046c0728f2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce6c33be-c086-4705-a907-488346156772","handle":"qa-c046c0728f2d","displayName":"QA c046c0728f2d","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.318657693Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-74b744ce-20dd-4136-a84e-b28f2f6e682e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74b744ce-20dd-4136-a84e-b28f2f6e682e
Content-Type: application/json

--- request body ---
{"handle":"qa-2da242055795","displayName":"QA 2da242055795","password":"****","region":"eu"}

--- response: 201 in 83 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-74b744ce-20dd-4136-a84e-b28f2f6e682e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Location: /v1/accounts/qa-2da242055795
X-Served-Region: eu
Content-Length: 181

{"id":"acc_86898540-15e7-4aee-8f9e-145ab167a417","handle":"qa-2da242055795","displayName":"QA 2da242055795","region":"eu","role":"user","createdAt":"2026-11-20T10:10:03.404810001Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0ce15236-be54-4356-8cdc-754c5ef24f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ce15236-be54-4356-8cdc-754c5ef24f4e
Content-Type: application/json

--- request body ---
{"handle":"qa-c046c0728f2d","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ce15236-be54-4356-8cdc-754c5ef24f4e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce6c33be-c086-4705-a907-488346156772"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-cc863b90-76cf-427a-80b4-95984c0946f3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2fc8d827e4d241b2bd5d60e1709bd6cb
X-Correlation-Id: qa-cc863b90-76cf-427a-80b4-95984c0946f3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc863b90-76cf-427a-80b4-95984c0946f3
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
Location: /v1/credits/purchases/pur_dcb94a95-a8a3-447c-9e31-8e714ca9ed36
Content-Length: 144

{"id":"pur_dcb94a95-a8a3-447c-9e31-8e714ca9ed36","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-20T10:10:03.524699088Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-392f8195-70f0-42ff-9875-bdd12dbf2bbf

--- request headers ---
Accept: application/json
Idempotency-Key: qa-cdfd6d672c974b53b5d030eb0c0ba5bc
X-Correlation-Id: qa-392f8195-70f0-42ff-9875-bdd12dbf2bbf
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-392f8195-70f0-42ff-9875-bdd12dbf2bbf
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
Location: /v1/credits/purchases/pur_2c3d48fd-7bbf-4ed3-b1ac-5e3ea44d907f
Content-Length: 144

{"id":"pur_2c3d48fd-7bbf-4ed3-b1ac-5e3ea44d907f","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-20T10:10:03.560956119Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-064ec5d0-14ec-435f-bee8-2c65e11e603b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-064ec5d0-14ec-435f-bee8-2c65e11e603b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2da242055795","subject":"Paid message","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-064ec5d0-14ec-435f-bee8-2c65e11e603b
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
Location: /v1/conversations/cnv_e9bddb4a-7ba2-4556-88f9-5990581f6169
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_e9bddb4a-7ba2-4556-88f9-5990581f6169","subject":"Paid message","status":"open","region":"eu","participants":["qa-c046c0728f2d","qa-2da242055795"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:03.588746734Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-319ab9f7-1c6f-4eb4-bcca-170d094295b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-319ab9f7-1c6f-4eb4-bcca-170d094295b6
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-319ab9f7-1c6f-4eb4-bcca-170d094295b6
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

{"items":[{"id":"led_491b4fed-607f-41db-ab95-218ec1160a3a","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-20T10:10:03.318671569Z"},{"id":"led_5fee6c05-9486-4c91-8521-f941d8ace8e9","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_dcb94a95-a8a3-447c-9e31-8e714ca9ed36","createdAt":"2026-11-20T10:10:03.524699088Z"},{"id":"led_95251943-b523-427a-abc2-912d236649d2","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_2c3d48fd-7bbf-4ed3-b1ac-5e3ea44d907f","createdAt":"2026-11-20T10:10:03.560956119Z"},{"id":"led_661e7819-db61-4509-ac2f-577ad85e2499","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_e9bddb4a-7ba2-4556-88f9-5990581f6169","createdAt":"2026-11-20T10:10:03.588724993Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-97833d3e-3733-4276-8ea8-631f008f7f94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97833d3e-3733-4276-8ea8-631f008f7f94
Content-Type: application/json

--- response: 200 in 42 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-97833d3e-3733-4276-8ea8-631f008f7f94
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

{"balance":64,"currency":"credits","accountId":"acc_ce6c33be-c086-4705-a907-488346156772"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-8b7657f0-1bbc-4651-8873-94ac09ca0349

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b7657f0-1bbc-4651-8873-94ac09ca0349
Content-Type: application/json

--- request body ---
{"handle":"qa-2da242055795","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b7657f0-1bbc-4651-8873-94ac09ca0349
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_86898540-15e7-4aee-8f9e-145ab167a417"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-876f9b46-756f-4447-afde-75d7cd39318d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-876f9b46-756f-4447-afde-75d7cd39318d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-876f9b46-756f-4447-afde-75d7cd39318d
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
correlation: qa-c9d20565-0eed-4867-8968-f2a486bbf3ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9d20565-0eed-4867-8968-f2a486bbf3ca
Content-Type: application/json

--- request body ---
{"handle":"qa-2da242055795","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9d20565-0eed-4867-8968-f2a486bbf3ca
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c9d20565-0eed-4867-8968-f2a486bbf3ca"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-50832383-7abf-4581-acc3-fb7b360b41f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50832383-7abf-4581-acc3-fb7b360b41f3
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-50832383-7abf-4581-acc3-fb7b360b41f3
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
correlation: qa-70ca4ab5-308c-4b7b-bcd2-24f28f66149b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70ca4ab5-308c-4b7b-bcd2-24f28f66149b
Content-Type: application/json

--- request body ---
{"handle":"qa-c046c0728f2d","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-70ca4ab5-308c-4b7b-bcd2-24f28f66149b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-70ca4ab5-308c-4b7b-bcd2-24f28f66149b"}
```
