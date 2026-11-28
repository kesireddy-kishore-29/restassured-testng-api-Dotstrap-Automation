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
| 1 | `POST /v1/accounts` | 201 | 325 | `qa-949e5d50-f413-4dad-827d-78ae86e5b4b9` |
| 4 | `POST /v1/auth/token` | 200 | 40 | `qa-30c473d6-2fed-4b89-b640-a40cd951436c` |
| 3 | `POST /v1/auth/token` | 200 | 44 | `qa-ac9f3fcd-601b-451d-aaad-d29bb00eeaa7` |
| 5 | `POST /v1/auth/token` | 200 | 38 | `qa-575d4746-1475-46ae-b61e-be4abf70a4a3` |
| 7 | `POST /v1/auth/token` | 200 | 35 | `qa-b252403e-79cd-421c-a658-01ecc4effd10` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-48edfb33-8a2d-4db7-92c8-2f7e27622dde` |
| 2 | `POST /v1/auth/token` | 200 | 53 | `qa-190fecf6-8f40-4105-95be-65138ae89792` |
| 12 | `POST /v1/credits/purchases` | 200 | 29 | `qa-a19c9d9a-38f7-4571-b4e9-05f909e9c4ed` |
| 10 | `POST /v1/credits/purchases` | 201 | 36 | `qa-208316d8-3065-4dfd-aa9a-a26ae9ea35e3` |
| 8 | `POST /v1/credits/purchases` | 200 | 56 | `qa-bd99cd36-12ac-4243-927e-be7313d7dda3` |
| 9 | `POST /v1/credits/purchases` | 200 | 45 | `qa-b53b501a-21b0-4dba-a79f-d9ef00e7699c` |
| 11 | `POST /v1/credits/purchases` | 200 | 37 | `qa-7cf4b8cc-da6a-4b45-a545-a8a9273ac97d` |
| 13 | `POST /v1/credits/purchases` | 200 | 34 | `qa-9aefa872-faff-4a49-bfe9-6e0d55e2ae44` |
| 14 | `POST /v1/auth/token` | 200 | 19 | `qa-f7e482fe-4166-476f-a712-6528c459d621` |
| 15 | `GET /v1/credits/balance` | 200 | 13 | `qa-75ecc362-a85d-451c-8a30-99b83ba79786` |
| 16 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-de6f0a4f-bb8b-48c2-8ca9-70bd3ebf6028` |
| 17 | `POST /v1/auth/token` | 401 | 12 | `qa-c8984948-b704-4bef-bb82-fda92e34b8fb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-949e5d50-f413-4dad-827d-78ae86e5b4b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-949e5d50-f413-4dad-827d-78ae86e5b4b9
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","displayName":"QA f78fdd5dd8ea","password":"****","region":"eu"}

--- response: 201 in 325 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-949e5d50-f413-4dad-827d-78ae86e5b4b9
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
Location: /v1/accounts/qa-f78fdd5dd8ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f","handle":"qa-f78fdd5dd8ea","displayName":"QA f78fdd5dd8ea","region":"eu","role":"user","createdAt":"2026-11-27T10:59:48.114526988Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-30c473d6-2fed-4b89-b640-a40cd951436c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30c473d6-2fed-4b89-b640-a40cd951436c
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-30c473d6-2fed-4b89-b640-a40cd951436c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ac9f3fcd-601b-451d-aaad-d29bb00eeaa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac9f3fcd-601b-451d-aaad-d29bb00eeaa7
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","password":"****"}

--- response: 200 in 44 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac9f3fcd-601b-451d-aaad-d29bb00eeaa7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-575d4746-1475-46ae-b61e-be4abf70a4a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-575d4746-1475-46ae-b61e-be4abf70a4a3
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","password":"****"}

--- response: 200 in 38 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-575d4746-1475-46ae-b61e-be4abf70a4a3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-b252403e-79cd-421c-a658-01ecc4effd10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b252403e-79cd-421c-a658-01ecc4effd10
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b252403e-79cd-421c-a658-01ecc4effd10
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-48edfb33-8a2d-4db7-92c8-2f7e27622dde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48edfb33-8a2d-4db7-92c8-2f7e27622dde
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","password":"****"}

--- response: 200 in 40 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-48edfb33-8a2d-4db7-92c8-2f7e27622dde
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-190fecf6-8f40-4105-95be-65138ae89792

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-190fecf6-8f40-4105-95be-65138ae89792
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","password":"****"}

--- response: 200 in 53 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-190fecf6-8f40-4105-95be-65138ae89792
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a19c9d9a-38f7-4571-b4e9-05f909e9c4ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e6b5ed10300d4ed99e3cdf40453065f2
X-Correlation-Id: qa-a19c9d9a-38f7-4571-b4e9-05f909e9c4ed
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-a19c9d9a-38f7-4571-b4e9-05f909e9c4ed
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
Location: /v1/credits/purchases/pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.582684375Z"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-208316d8-3065-4dfd-aa9a-a26ae9ea35e3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e6b5ed10300d4ed99e3cdf40453065f2
X-Correlation-Id: qa-208316d8-3065-4dfd-aa9a-a26ae9ea35e3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-208316d8-3065-4dfd-aa9a-a26ae9ea35e3
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
Location: /v1/credits/purchases/pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac
Content-Length: 144

{"id":"pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.582684375Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-bd99cd36-12ac-4243-927e-be7313d7dda3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e6b5ed10300d4ed99e3cdf40453065f2
X-Correlation-Id: qa-bd99cd36-12ac-4243-927e-be7313d7dda3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 56 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd99cd36-12ac-4243-927e-be7313d7dda3
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
Location: /v1/credits/purchases/pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.582684375Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-b53b501a-21b0-4dba-a79f-d9ef00e7699c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e6b5ed10300d4ed99e3cdf40453065f2
X-Correlation-Id: qa-b53b501a-21b0-4dba-a79f-d9ef00e7699c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 45 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b53b501a-21b0-4dba-a79f-d9ef00e7699c
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
Location: /v1/credits/purchases/pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.582684375Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7cf4b8cc-da6a-4b45-a545-a8a9273ac97d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e6b5ed10300d4ed99e3cdf40453065f2
X-Correlation-Id: qa-7cf4b8cc-da6a-4b45-a545-a8a9273ac97d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 37 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-7cf4b8cc-da6a-4b45-a545-a8a9273ac97d
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
Location: /v1/credits/purchases/pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.582684375Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9aefa872-faff-4a49-bfe9-6e0d55e2ae44

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e6b5ed10300d4ed99e3cdf40453065f2
X-Correlation-Id: qa-9aefa872-faff-4a49-bfe9-6e0d55e2ae44
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aefa872-faff-4a49-bfe9-6e0d55e2ae44
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
Location: /v1/credits/purchases/pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_e7418ff6-e0f2-42be-b5b5-76b903e3e8ac","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-27T10:59:48.582684375Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f7e482fe-4166-476f-a712-6528c459d621

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7e482fe-4166-476f-a712-6528c459d621
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7e482fe-4166-476f-a712-6528c459d621
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-75ecc362-a85d-451c-8a30-99b83ba79786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75ecc362-a85d-451c-8a30-99b83ba79786
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-75ecc362-a85d-451c-8a30-99b83ba79786
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

{"balance":15,"currency":"credits","accountId":"acc_ce0db365-97e4-42c1-a65c-5e1183ff284f"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-de6f0a4f-bb8b-48c2-8ca9-70bd3ebf6028

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de6f0a4f-bb8b-48c2-8ca9-70bd3ebf6028
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-de6f0a4f-bb8b-48c2-8ca9-70bd3ebf6028
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
correlation: qa-c8984948-b704-4bef-bb82-fda92e34b8fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8984948-b704-4bef-bb82-fda92e34b8fb
Content-Type: application/json

--- request body ---
{"handle":"qa-f78fdd5dd8ea","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c8984948-b704-4bef-bb82-fda92e34b8fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c8984948-b704-4bef-bb82-fda92e34b8fb"}
```
