# Transcript: Six concurrent duplicates: one purchase, five replays, one charge

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#concurrentDuplicatesProduceOnePurchase` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 17 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 491 | `qa-332df540-54df-4ee0-9bb6-2e0bc13bd26e` |
| 3 | `POST /v1/auth/token` | 200 | 80 | `qa-c03241f1-8021-4f5a-a5e9-488fb6219cf7` |
| 2 | `POST /v1/auth/token` | 200 | 87 | `qa-231cfc49-3db6-45c7-8b1b-eece2cf06233` |
| 5 | `POST /v1/auth/token` | 200 | 84 | `qa-c6c8bbaa-688e-4607-bcc5-1c0a561e1f13` |
| 4 | `POST /v1/auth/token` | 200 | 99 | `qa-eddc093c-317f-454f-bce9-bb82f29abea0` |
| 7 | `POST /v1/auth/token` | 200 | 88 | `qa-6a90f611-bde8-4342-b5b3-602e789bcecf` |
| 6 | `POST /v1/auth/token` | 200 | 99 | `qa-c1e86f22-4e32-417f-9252-4067d85c8921` |
| 8 | `POST /v1/credits/purchases` | 201 | 98 | `qa-ef77daab-b580-4a7c-b328-093309fad72a` |
| 9 | `POST /v1/credits/purchases` | 200 | 98 | `qa-fc5a39ee-c033-4ec1-bfd8-092802aa2e83` |
| 12 | `POST /v1/credits/purchases` | 200 | 88 | `qa-8caf814f-3285-4044-95ce-ae29d139b447` |
| 13 | `POST /v1/credits/purchases` | 200 | 82 | `qa-99bb0a9d-bdf2-4a62-b9b4-8a7119d31550` |
| 10 | `POST /v1/credits/purchases` | 200 | 95 | `qa-a44ef2b7-8dc1-49c0-9aa6-03783592f4b3` |
| 11 | `POST /v1/credits/purchases` | 200 | 94 | `qa-53e64e56-ca34-475a-9d19-6dbde4c2c47e` |
| 14 | `POST /v1/auth/token` | 200 | 17 | `qa-072c7aa1-dbf5-484e-a5df-3c6d33993145` |
| 15 | `GET /v1/credits/balance` | 200 | 18 | `qa-3e539a56-fe24-4e42-98e6-551a22a89db9` |
| 16 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-524b17a4-df83-48cf-9cf3-fbb07fafae75` |
| 17 | `POST /v1/auth/token` | 401 | 9 | `qa-b6a8a668-3796-4caf-b2c6-fc193e704e1d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-332df540-54df-4ee0-9bb6-2e0bc13bd26e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-332df540-54df-4ee0-9bb6-2e0bc13bd26e
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","displayName":"QA 2159ab6d6fcc","password":"****","region":"eu"}

--- response: 201 in 491 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-332df540-54df-4ee0-9bb6-2e0bc13bd26e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-2159ab6d6fcc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b01a1058-b65d-4206-99c9-5f343315e605","handle":"qa-2159ab6d6fcc","displayName":"QA 2159ab6d6fcc","region":"eu","role":"user","createdAt":"2026-11-01T09:23:29.287562730Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c03241f1-8021-4f5a-a5e9-488fb6219cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c03241f1-8021-4f5a-a5e9-488fb6219cf7
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","password":"****"}

--- response: 200 in 80 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c03241f1-8021-4f5a-a5e9-488fb6219cf7
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b01a1058-b65d-4206-99c9-5f343315e605"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-231cfc49-3db6-45c7-8b1b-eece2cf06233

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-231cfc49-3db6-45c7-8b1b-eece2cf06233
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","password":"****"}

--- response: 200 in 87 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-231cfc49-3db6-45c7-8b1b-eece2cf06233
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b01a1058-b65d-4206-99c9-5f343315e605"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c6c8bbaa-688e-4607-bcc5-1c0a561e1f13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c8bbaa-688e-4607-bcc5-1c0a561e1f13
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","password":"****"}

--- response: 200 in 84 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6c8bbaa-688e-4607-bcc5-1c0a561e1f13
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b01a1058-b65d-4206-99c9-5f343315e605"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-eddc093c-317f-454f-bce9-bb82f29abea0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eddc093c-317f-454f-bce9-bb82f29abea0
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","password":"****"}

--- response: 200 in 99 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-eddc093c-317f-454f-bce9-bb82f29abea0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b01a1058-b65d-4206-99c9-5f343315e605"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-6a90f611-bde8-4342-b5b3-602e789bcecf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a90f611-bde8-4342-b5b3-602e789bcecf
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","password":"****"}

--- response: 200 in 88 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a90f611-bde8-4342-b5b3-602e789bcecf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b01a1058-b65d-4206-99c9-5f343315e605"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c1e86f22-4e32-417f-9252-4067d85c8921

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1e86f22-4e32-417f-9252-4067d85c8921
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","password":"****"}

--- response: 200 in 99 ms ---
Date: Sun, 01 Nov 2026 09:23:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1e86f22-4e32-417f-9252-4067d85c8921
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b01a1058-b65d-4206-99c9-5f343315e605"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ef77daab-b580-4a7c-b328-093309fad72a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-efdc0f007d4b44fd892d045ab150c634
X-Correlation-Id: qa-ef77daab-b580-4a7c-b328-093309fad72a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 98 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef77daab-b580-4a7c-b328-093309fad72a
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
Location: /v1/credits/purchases/pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6
Content-Length: 144

{"id":"pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.044736114Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fc5a39ee-c033-4ec1-bfd8-092802aa2e83

--- request headers ---
Accept: application/json
Idempotency-Key: qa-efdc0f007d4b44fd892d045ab150c634
X-Correlation-Id: qa-fc5a39ee-c033-4ec1-bfd8-092802aa2e83
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 98 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc5a39ee-c033-4ec1-bfd8-092802aa2e83
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
Location: /v1/credits/purchases/pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.044736114Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8caf814f-3285-4044-95ce-ae29d139b447

--- request headers ---
Accept: application/json
Idempotency-Key: qa-efdc0f007d4b44fd892d045ab150c634
X-Correlation-Id: qa-8caf814f-3285-4044-95ce-ae29d139b447
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 88 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-8caf814f-3285-4044-95ce-ae29d139b447
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
Location: /v1/credits/purchases/pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.044736114Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-99bb0a9d-bdf2-4a62-b9b4-8a7119d31550

--- request headers ---
Accept: application/json
Idempotency-Key: qa-efdc0f007d4b44fd892d045ab150c634
X-Correlation-Id: qa-99bb0a9d-bdf2-4a62-b9b4-8a7119d31550
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 82 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-99bb0a9d-bdf2-4a62-b9b4-8a7119d31550
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
Location: /v1/credits/purchases/pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.044736114Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a44ef2b7-8dc1-49c0-9aa6-03783592f4b3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-efdc0f007d4b44fd892d045ab150c634
X-Correlation-Id: qa-a44ef2b7-8dc1-49c0-9aa6-03783592f4b3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 95 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a44ef2b7-8dc1-49c0-9aa6-03783592f4b3
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
Location: /v1/credits/purchases/pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.044736114Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-53e64e56-ca34-475a-9d19-6dbde4c2c47e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-efdc0f007d4b44fd892d045ab150c634
X-Correlation-Id: qa-53e64e56-ca34-475a-9d19-6dbde4c2c47e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 94 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-53e64e56-ca34-475a-9d19-6dbde4c2c47e
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
Location: /v1/credits/purchases/pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_5e98e54f-68dd-443e-a597-f1bc0a873ec6","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-01T09:23:30.044736114Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-072c7aa1-dbf5-484e-a5df-3c6d33993145

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072c7aa1-dbf5-484e-a5df-3c6d33993145
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-072c7aa1-dbf5-484e-a5df-3c6d33993145
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b01a1058-b65d-4206-99c9-5f343315e605"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-3e539a56-fe24-4e42-98e6-551a22a89db9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e539a56-fe24-4e42-98e6-551a22a89db9
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e539a56-fe24-4e42-98e6-551a22a89db9
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
Content-Length: 90

{"balance":15,"currency":"credits","accountId":"acc_b01a1058-b65d-4206-99c9-5f343315e605"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-524b17a4-df83-48cf-9cf3-fbb07fafae75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-524b17a4-df83-48cf-9cf3-fbb07fafae75
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-524b17a4-df83-48cf-9cf3-fbb07fafae75
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
```

## 17. POST /v1/auth/token

```text
#17 POST http://localhost:7070/v1/auth/token
correlation: qa-b6a8a668-3796-4caf-b2c6-fc193e704e1d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6a8a668-3796-4caf-b2c6-fc193e704e1d
Content-Type: application/json

--- request body ---
{"handle":"qa-2159ab6d6fcc","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b6a8a668-3796-4caf-b2c6-fc193e704e1d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b6a8a668-3796-4caf-b2c6-fc193e704e1d"}
```
