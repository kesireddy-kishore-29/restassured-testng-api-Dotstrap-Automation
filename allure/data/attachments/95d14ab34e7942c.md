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
| 1 | `POST /v1/accounts` | 201 | 339 | `qa-6878ba2b-dc6c-460c-ae4e-3107b9f3a089` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-b4a155ff-4cd7-4ad8-9efd-641c94ed609c` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-62ec9dbd-3a66-4947-9877-4cf3957cb1a7` |
| 4 | `POST /v1/auth/token` | 200 | 48 | `qa-0deed736-5a3c-4c72-9296-94c7ed1581bc` |
| 5 | `POST /v1/auth/token` | 200 | 34 | `qa-352602e9-377e-46b9-b79a-728bb33d8a85` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-afec2544-a4ed-4969-8acb-fbfbf6037721` |
| 7 | `POST /v1/auth/token` | 200 | 37 | `qa-d7b34089-19e3-4553-8f33-292e2198e2ac` |
| 10 | `POST /v1/credits/purchases` | 200 | 52 | `qa-2a625e46-b08e-447b-af2d-e65d2ce766ed` |
| 11 | `POST /v1/credits/purchases` | 200 | 49 | `qa-2858b270-d690-493b-92b1-f23ce0239c47` |
| 8 | `POST /v1/credits/purchases` | 200 | 58 | `qa-60098aa7-1270-471d-b6a1-f637850c45b4` |
| 9 | `POST /v1/credits/purchases` | 201 | 45 | `qa-dc39ab2d-de4c-410d-8f19-df7da618b17d` |
| 12 | `POST /v1/credits/purchases` | 200 | 51 | `qa-77267fda-ac42-4596-9a1f-22a7273f1d31` |
| 13 | `POST /v1/credits/purchases` | 200 | 42 | `qa-634a6170-4cc2-4797-9dfc-e81f7c750df7` |
| 14 | `POST /v1/auth/token` | 200 | 26 | `qa-6c8d46d6-f2cd-4f4d-a16a-5d2750d9a6b7` |
| 15 | `GET /v1/credits/balance` | 200 | 7 | `qa-79767a68-6963-4849-af92-7e5e430dc060` |
| 16 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-fcd3d283-3466-46d5-9edc-d911f93d9174` |
| 17 | `POST /v1/auth/token` | 401 | 6 | `qa-d776296f-19f2-4530-95cd-523611b7da86` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6878ba2b-dc6c-460c-ae4e-3107b9f3a089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6878ba2b-dc6c-460c-ae4e-3107b9f3a089
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","displayName":"QA ac57ec2139c2","password":"****","region":"eu"}

--- response: 201 in 339 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6878ba2b-dc6c-460c-ae4e-3107b9f3a089
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
Location: /v1/accounts/qa-ac57ec2139c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3","handle":"qa-ac57ec2139c2","displayName":"QA ac57ec2139c2","region":"eu","role":"user","createdAt":"2026-11-28T10:37:12.207289024Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b4a155ff-4cd7-4ad8-9efd-641c94ed609c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4a155ff-4cd7-4ad8-9efd-641c94ed609c
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","password":"****"}

--- response: 200 in 49 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4a155ff-4cd7-4ad8-9efd-641c94ed609c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-62ec9dbd-3a66-4947-9877-4cf3957cb1a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62ec9dbd-3a66-4947-9877-4cf3957cb1a7
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-62ec9dbd-3a66-4947-9877-4cf3957cb1a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0deed736-5a3c-4c72-9296-94c7ed1581bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0deed736-5a3c-4c72-9296-94c7ed1581bc
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","password":"****"}

--- response: 200 in 48 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-0deed736-5a3c-4c72-9296-94c7ed1581bc
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-352602e9-377e-46b9-b79a-728bb33d8a85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-352602e9-377e-46b9-b79a-728bb33d8a85
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-352602e9-377e-46b9-b79a-728bb33d8a85
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-afec2544-a4ed-4969-8acb-fbfbf6037721

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afec2544-a4ed-4969-8acb-fbfbf6037721
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-afec2544-a4ed-4969-8acb-fbfbf6037721
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-d7b34089-19e3-4553-8f33-292e2198e2ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7b34089-19e3-4553-8f33-292e2198e2ac
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7b34089-19e3-4553-8f33-292e2198e2ac
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3"}
```

## 10. POST /v1/credits/purchases

```text
#10 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2a625e46-b08e-447b-af2d-e65d2ce766ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0869e6382a764b1b9224c6cdf81a08b9
X-Correlation-Id: qa-2a625e46-b08e-447b-af2d-e65d2ce766ed
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 52 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a625e46-b08e-447b-af2d-e65d2ce766ed
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
Location: /v1/credits/purchases/pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.691940808Z"}
```

## 11. POST /v1/credits/purchases

```text
#11 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2858b270-d690-493b-92b1-f23ce0239c47

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0869e6382a764b1b9224c6cdf81a08b9
X-Correlation-Id: qa-2858b270-d690-493b-92b1-f23ce0239c47
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 49 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-2858b270-d690-493b-92b1-f23ce0239c47
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
Location: /v1/credits/purchases/pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.691940808Z"}
```

## 8. POST /v1/credits/purchases

```text
#8 POST http://localhost:7070/v1/credits/purchases
correlation: qa-60098aa7-1270-471d-b6a1-f637850c45b4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0869e6382a764b1b9224c6cdf81a08b9
X-Correlation-Id: qa-60098aa7-1270-471d-b6a1-f637850c45b4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 58 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-60098aa7-1270-471d-b6a1-f637850c45b4
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
Location: /v1/credits/purchases/pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.691940808Z"}
```

## 9. POST /v1/credits/purchases

```text
#9 POST http://localhost:7070/v1/credits/purchases
correlation: qa-dc39ab2d-de4c-410d-8f19-df7da618b17d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0869e6382a764b1b9224c6cdf81a08b9
X-Correlation-Id: qa-dc39ab2d-de4c-410d-8f19-df7da618b17d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 45 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc39ab2d-de4c-410d-8f19-df7da618b17d
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
Location: /v1/credits/purchases/pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4
Content-Length: 144

{"id":"pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.691940808Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-77267fda-ac42-4596-9a1f-22a7273f1d31

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0869e6382a764b1b9224c6cdf81a08b9
X-Correlation-Id: qa-77267fda-ac42-4596-9a1f-22a7273f1d31
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 51 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-77267fda-ac42-4596-9a1f-22a7273f1d31
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
Location: /v1/credits/purchases/pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.691940808Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-634a6170-4cc2-4797-9dfc-e81f7c750df7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0869e6382a764b1b9224c6cdf81a08b9
X-Correlation-Id: qa-634a6170-4cc2-4797-9dfc-e81f7c750df7
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 200 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-634a6170-4cc2-4797-9dfc-e81f7c750df7
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
Location: /v1/credits/purchases/pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4
Idempotent-Replayed: true
Content-Length: 144

{"id":"pur_d6733e31-ca46-4587-b3a8-975a5ffb97f4","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:12.691940808Z"}
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-6c8d46d6-f2cd-4f4d-a16a-5d2750d9a6b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c8d46d6-f2cd-4f4d-a16a-5d2750d9a6b7
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c8d46d6-f2cd-4f4d-a16a-5d2750d9a6b7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3"}
```

## 15. GET /v1/credits/balance

```text
#15 GET http://localhost:7070/v1/credits/balance
correlation: qa-79767a68-6963-4849-af92-7e5e430dc060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79767a68-6963-4849-af92-7e5e430dc060
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-79767a68-6963-4849-af92-7e5e430dc060
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

{"balance":15,"currency":"credits","accountId":"acc_b3fc7421-40ce-4693-a191-e8c31bf364c3"}
```

## 16. DELETE /v1/accounts/me

```text
#16 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fcd3d283-3466-46d5-9edc-d911f93d9174

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcd3d283-3466-46d5-9edc-d911f93d9174
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fcd3d283-3466-46d5-9edc-d911f93d9174
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
correlation: qa-d776296f-19f2-4530-95cd-523611b7da86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d776296f-19f2-4530-95cd-523611b7da86
Content-Type: application/json

--- request body ---
{"handle":"qa-ac57ec2139c2","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d776296f-19f2-4530-95cd-523611b7da86
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d776296f-19f2-4530-95cd-523611b7da86"}
```
