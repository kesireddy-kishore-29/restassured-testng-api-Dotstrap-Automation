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
| 1 | `POST /v1/accounts` | 201 | 314 | `qa-bb8f2ea4-e4ed-4ee7-83b6-96dfa0868c5a` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-3688dc8e-2e6d-4854-b3c1-cff67fef9115` |
| 5 | `POST /v1/auth/token` | 200 | 30 | `qa-2e1b3a6a-8f24-4543-ab6c-8a4b9fbaf660` |
| 2 | `POST /v1/auth/token` | 200 | 40 | `qa-7016f284-cf77-496b-bc41-f26ea8c2a35a` |
| 6 | `POST /v1/auth/token` | 200 | 32 | `qa-f3875f8e-ca43-4e2d-807e-c6994ca59393` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-52cfece7-9c9b-4f10-9b2f-e3c423cf0875` |
| 7 | `POST /v1/auth/token` | 200 | 36 | `qa-50201986-146f-4245-91bf-8660682fda66` |
| 10 | `POST /v1/credits/purchases` | 200 | 35 | `qa-17d96cd4-140e-4558-aacf-6cc865098e72` |
| 12 | `POST /v1/credits/purchases` | 200 | 33 | `qa-20645a47-7def-4a0f-9442-11b744c1596d` |
| 13 | `POST /v1/credits/purchases` | 201 | 33 | `qa-36a39396-a666-4825-a262-2a3056bdf688` |
| 8 | `POST /v1/credits/purchases` | 200 | 47 | `qa-ceb33aad-8a20-4e08-9017-11c554727d5e` |
| 9 | `POST /v1/credits/purchases` | 200 | 47 | `qa-30bb879b-ed48-4e46-97c3-79fc74b42275` |
| 11 | `POST /v1/credits/purchases` | 200 | 39 | `qa-df45ae96-81e4-40b9-b8d2-ff2e0969143a` |
| 14 | `POST /v1/auth/token` | 200 | 26 | `qa-b1c1690e-4b1a-445d-a6fd-7d35794890cd` |
| 15 | `GET /v1/credits/balance` | 200 | 11 | `qa-2ebe216e-bcef-4c58-b182-3cc3f813c9a5` |
| 16 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-fe31f6cc-d096-4427-a56d-0aa99921c727` |
| 17 | `POST /v1/auth/token` | 401 | 16 | `qa-a30b2067-c509-48b6-ad2e-2c3c34f67e49` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb8f2ea4-e4ed-4ee7-83b6-96dfa0868c5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb8f2ea4-e4ed-4ee7-83b6-96dfa0868c5a
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","displayName":"QA 6c93a9bbb123","password":"****","region":"eu"}

--- response: 201 in 314 ms ---
Date: Tue, 24 Nov 2026 12:37:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb8f2ea4-e4ed-4ee7-83b6-96dfa0868c5a
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
Location: /v1/accounts/qa-6c93a9bbb123
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f03ab46c-559d-415d-af63-5e283c5617d5","handle":"qa-6c93a9bbb123","displayName":"QA 6c93a9bbb123","region":"eu","role":"user","createdAt":"2026-11-24T12:37:58.865364691Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3688dc8e-2e6d-4854-b3c1-cff67fef9115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3688dc8e-2e6d-4854-b3c1-cff67fef9115
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","password":"****"}

--- response: 200 in 29 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3688dc8e-2e6d-4854-b3c1-cff67fef9115
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03ab46c-559d-415d-af63-5e283c5617d5"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-2e1b3a6a-8f24-4543-ab6c-8a4b9fbaf660

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e1b3a6a-8f24-4543-ab6c-8a4b9fbaf660
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","password":"****"}

--- response: 200 in 30 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e1b3a6a-8f24-4543-ab6c-8a4b9fbaf660
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03ab46c-559d-415d-af63-5e283c5617d5"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7016f284-cf77-496b-bc41-f26ea8c2a35a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7016f284-cf77-496b-bc41-f26ea8c2a35a
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","password":"****"}

--- response: 200 in 40 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-7016f284-cf77-496b-bc41-f26ea8c2a35a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03ab46c-559d-415d-af63-5e283c5617d5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f3875f8e-ca43-4e2d-807e-c6994ca59393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3875f8e-ca43-4e2d-807e-c6994ca59393
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3875f8e-ca43-4e2d-807e-c6994ca59393
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03ab46c-559d-415d-af63-5e283c5617d5"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-52cfece7-9c9b-4f10-9b2f-e3c423cf0875

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52cfece7-9c9b-4f10-9b2f-e3c423cf0875
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-52cfece7-9c9b-4f10-9b2f-e3c423cf0875
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03ab46c-559d-415d-af63-5e283c5617d5"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-50201986-146f-4245-91bf-8660682fda66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50201986-146f-4245-91bf-8660682fda66
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","password":"****"}

--- response: 200 in 36 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-50201986-146f-4245-91bf-8660682fda66
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03ab46c-559d-415d-af63-5e283c5617d5"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-17d96cd4-140e-4558-aacf-6cc865098e72

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e42c17ed1b92487d90165a101128c112
X-Correlation-Id: qa-17d96cd4-140e-4558-aacf-6cc865098e72
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 35 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d96cd4-140e-4558-aacf-6cc865098e72
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
Location: /v1/credits/purchases/pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.196582584Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-20645a47-7def-4a0f-9442-11b744c1596d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e42c17ed1b92487d90165a101128c112
X-Correlation-Id: qa-20645a47-7def-4a0f-9442-11b744c1596d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-20645a47-7def-4a0f-9442-11b744c1596d
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
Location: /v1/credits/purchases/pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.196582584Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-36a39396-a666-4825-a262-2a3056bdf688

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e42c17ed1b92487d90165a101128c112
X-Correlation-Id: qa-36a39396-a666-4825-a262-2a3056bdf688
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-36a39396-a666-4825-a262-2a3056bdf688
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
Location: /v1/credits/purchases/pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9
Content-Length: 144

{"id":"pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.196582584Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ceb33aad-8a20-4e08-9017-11c554727d5e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e42c17ed1b92487d90165a101128c112
X-Correlation-Id: qa-ceb33aad-8a20-4e08-9017-11c554727d5e
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 47 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ceb33aad-8a20-4e08-9017-11c554727d5e
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
Location: /v1/credits/purchases/pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.196582584Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-30bb879b-ed48-4e46-97c3-79fc74b42275

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e42c17ed1b92487d90165a101128c112
X-Correlation-Id: qa-30bb879b-ed48-4e46-97c3-79fc74b42275
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 47 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-30bb879b-ed48-4e46-97c3-79fc74b42275
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
Location: /v1/credits/purchases/pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.196582584Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-df45ae96-81e4-40b9-b8d2-ff2e0969143a

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e42c17ed1b92487d90165a101128c112
X-Correlation-Id: qa-df45ae96-81e4-40b9-b8d2-ff2e0969143a
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 39 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-df45ae96-81e4-40b9-b8d2-ff2e0969143a
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
Location: /v1/credits/purchases/pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_7cfaa9cb-3542-46dd-bb5a-182973ff7dd9","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-24T12:37:59.196582584Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-b1c1690e-4b1a-445d-a6fd-7d35794890cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1c1690e-4b1a-445d-a6fd-7d35794890cd
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","password":"****"}

--- response: 200 in 26 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1c1690e-4b1a-445d-a6fd-7d35794890cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f03ab46c-559d-415d-af63-5e283c5617d5"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-2ebe216e-bcef-4c58-b182-3cc3f813c9a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ebe216e-bcef-4c58-b182-3cc3f813c9a5
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ebe216e-bcef-4c58-b182-3cc3f813c9a5
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

{"balance":15,"currency":"credits","accountId":"acc_f03ab46c-559d-415d-af63-5e283c5617d5"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fe31f6cc-d096-4427-a56d-0aa99921c727

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe31f6cc-d096-4427-a56d-0aa99921c727
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fe31f6cc-d096-4427-a56d-0aa99921c727
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
correlation: qa-a30b2067-c509-48b6-ad2e-2c3c34f67e49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a30b2067-c509-48b6-ad2e-2c3c34f67e49
Content-Type: application/json

--- request body ---
{"handle":"qa-6c93a9bbb123","password":"****"}

--- response: 401 in 16 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a30b2067-c509-48b6-ad2e-2c3c34f67e49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a30b2067-c509-48b6-ad2e-2c3c34f67e49"}
```
