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
| 1 | `POST /v1/accounts` | 201 | 659 | `qa-772458af-037c-4a3f-8b2c-d1be1b50bb7f` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-e84549d1-c2e4-4053-952c-b76aee9f4b65` |
| 3 | `POST /v1/auth/token` | 200 | 57 | `qa-74d53d45-a5c6-4509-acc6-eaa286a2ed2c` |
| 4 | `POST /v1/credits/purchases` | 201 | 63 | `qa-d136949f-f63f-4bae-b746-f41d8ac225ec` |
| 5 | `POST /v1/credits/purchases` | 201 | 26 | `qa-3391eb4f-4d5d-48b5-a184-5f4ab8fcff2f` |
| 6 | `POST /v1/conversations` | 201 | 30 | `qa-41e1e54a-ad8e-4b9d-ab94-2fd088879118` |
| 7 | `GET /v1/credits/ledger` | 200 | 12 | `qa-8dcde1ce-8e94-44a2-8ccc-be45d27cd70e` |
| 8 | `GET /v1/credits/balance` | 200 | 24 | `qa-b6a390e7-8566-4907-bf2d-d23bd15e56b9` |
| 9 | `POST /v1/auth/token` | 200 | 29 | `qa-c31c81c1-1970-4054-8b1f-63726e7d75f3` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-9d44b42b-baaf-4b82-98e9-9ddb287dbc4a` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-eb21e2d9-dc86-43a1-9948-dd32ca8d4af3` |
| 12 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d80ed657-79c8-4fc9-8ea4-f6e29e44a640` |
| 13 | `POST /v1/auth/token` | 401 | 8 | `qa-a81f3272-82e8-4c2a-a842-1eac8f95b01b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-772458af-037c-4a3f-8b2c-d1be1b50bb7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-772458af-037c-4a3f-8b2c-d1be1b50bb7f
Content-Type: application/json

--- request body ---
{"handle":"qa-1c5719310296","displayName":"QA 1c5719310296","password":"****","region":"eu"}

--- response: 201 in 659 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-772458af-037c-4a3f-8b2c-d1be1b50bb7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-1c5719310296
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88fde83d-2105-4d16-9881-2dffdd8a09fc","handle":"qa-1c5719310296","displayName":"QA 1c5719310296","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.658927437Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e84549d1-c2e4-4053-952c-b76aee9f4b65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e84549d1-c2e4-4053-952c-b76aee9f4b65
Content-Type: application/json

--- request body ---
{"handle":"qa-25c1520c5e4b","displayName":"QA 25c1520c5e4b","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-e84549d1-c2e4-4053-952c-b76aee9f4b65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-25c1520c5e4b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d710108-fb6f-424c-af7a-c94b701353b7","handle":"qa-25c1520c5e4b","displayName":"QA 25c1520c5e4b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.031795192Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-74d53d45-a5c6-4509-acc6-eaa286a2ed2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74d53d45-a5c6-4509-acc6-eaa286a2ed2c
Content-Type: application/json

--- request body ---
{"handle":"qa-1c5719310296","password":"****"}

--- response: 200 in 57 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-74d53d45-a5c6-4509-acc6-eaa286a2ed2c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88fde83d-2105-4d16-9881-2dffdd8a09fc"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d136949f-f63f-4bae-b746-f41d8ac225ec

--- request headers ---
Accept: application/json
Idempotency-Key: qa-1a040cffc8874b228b82bae7e5a5455b
X-Correlation-Id: qa-d136949f-f63f-4bae-b746-f41d8ac225ec
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 63 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d136949f-f63f-4bae-b746-f41d8ac225ec
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
Location: /v1/credits/purchases/pur_c7fcbea5-91a7-4fb0-a5c7-3c1c6405f38e
Content-Length: 144

{"id":"pur_c7fcbea5-91a7-4fb0-a5c7-3c1c6405f38e","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-10-31T08:31:36.268391538Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3391eb4f-4d5d-48b5-a184-5f4ab8fcff2f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f2031b975c3b475b8f37fc3e05598958
X-Correlation-Id: qa-3391eb4f-4d5d-48b5-a184-5f4ab8fcff2f
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 26 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3391eb4f-4d5d-48b5-a184-5f4ab8fcff2f
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
Location: /v1/credits/purchases/pur_183aab7c-e5c3-4b36-94dd-889d8fbb6746
Content-Length: 144

{"id":"pur_183aab7c-e5c3-4b36-94dd-889d8fbb6746","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-10-31T08:31:36.350923784Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-41e1e54a-ad8e-4b9d-ab94-2fd088879118

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41e1e54a-ad8e-4b9d-ab94-2fd088879118
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-25c1520c5e4b","subject":"Paid message","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-41e1e54a-ad8e-4b9d-ab94-2fd088879118
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
Location: /v1/conversations/cnv_c1279038-efae-4790-9963-e3cdb8abf3d1
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_c1279038-efae-4790-9963-e3cdb8abf3d1","subject":"Paid message","status":"open","region":"eu","participants":["qa-1c5719310296","qa-25c1520c5e4b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.399994847Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-8dcde1ce-8e94-44a2-8ccc-be45d27cd70e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dcde1ce-8e94-44a2-8ccc-be45d27cd70e
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dcde1ce-8e94-44a2-8ccc-be45d27cd70e
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

{"items":[{"id":"led_6139b74b-e1b9-49de-8a6e-62b7710faceb","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-10-31T08:31:35.658936103Z"},{"id":"led_8b092dca-af2f-4051-9981-5e1d6f4f43ff","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_c7fcbea5-91a7-4fb0-a5c7-3c1c6405f38e","createdAt":"2026-10-31T08:31:36.268391538Z"},{"id":"led_28da6b33-749a-4dc3-a390-c0bd57a263f8","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_183aab7c-e5c3-4b36-94dd-889d8fbb6746","createdAt":"2026-10-31T08:31:36.350923784Z"},{"id":"led_c9d485c7-4753-4e19-9c74-c3609b5789aa","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_c1279038-efae-4790-9963-e3cdb8abf3d1","createdAt":"2026-10-31T08:31:36.399978577Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-b6a390e7-8566-4907-bf2d-d23bd15e56b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6a390e7-8566-4907-bf2d-d23bd15e56b9
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6a390e7-8566-4907-bf2d-d23bd15e56b9
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

{"balance":64,"currency":"credits","accountId":"acc_88fde83d-2105-4d16-9881-2dffdd8a09fc"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-c31c81c1-1970-4054-8b1f-63726e7d75f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c31c81c1-1970-4054-8b1f-63726e7d75f3
Content-Type: application/json

--- request body ---
{"handle":"qa-25c1520c5e4b","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c31c81c1-1970-4054-8b1f-63726e7d75f3
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d710108-fb6f-424c-af7a-c94b701353b7"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9d44b42b-baaf-4b82-98e9-9ddb287dbc4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d44b42b-baaf-4b82-98e9-9ddb287dbc4a
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9d44b42b-baaf-4b82-98e9-9ddb287dbc4a
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
correlation: qa-eb21e2d9-dc86-43a1-9948-dd32ca8d4af3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb21e2d9-dc86-43a1-9948-dd32ca8d4af3
Content-Type: application/json

--- request body ---
{"handle":"qa-25c1520c5e4b","password":"****"}

--- response: 401 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb21e2d9-dc86-43a1-9948-dd32ca8d4af3
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-eb21e2d9-dc86-43a1-9948-dd32ca8d4af3"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d80ed657-79c8-4fc9-8ea4-f6e29e44a640

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d80ed657-79c8-4fc9-8ea4-f6e29e44a640
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d80ed657-79c8-4fc9-8ea4-f6e29e44a640
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
correlation: qa-a81f3272-82e8-4c2a-a842-1eac8f95b01b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a81f3272-82e8-4c2a-a842-1eac8f95b01b
Content-Type: application/json

--- request body ---
{"handle":"qa-1c5719310296","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a81f3272-82e8-4c2a-a842-1eac8f95b01b
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a81f3272-82e8-4c2a-a842-1eac8f95b01b"}
```
