# Transcript: Ten concurrent purchases are all counted, exactly once

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#concurrentPurchasesSumCorrectly` |
| Features | FEAT-LEDGER-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 25 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-fe913b87-1163-43fd-bc06-17b6991f96b3` |
| 2 | `POST /v1/auth/token` | 200 | 41 | `qa-4f015638-1e9e-4e60-a963-5489ad4a5cc0` |
| 7 | `POST /v1/auth/token` | 200 | 26 | `qa-438a3fe7-ba14-4955-83a0-175b0cd02966` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-02d28031-6479-4921-bfd1-d0e45eedf2df` |
| 8 | `POST /v1/auth/token` | 200 | 32 | `qa-744f86b0-722a-406b-aace-ab6904e5508c` |
| 5 | `POST /v1/auth/token` | 200 | 43 | `qa-ad6c9cfa-db61-4193-b88d-4dd39eba3824` |
| 4 | `POST /v1/auth/token` | 200 | 52 | `qa-e6fecc85-4904-4622-bbfd-47ebcb192d35` |
| 3 | `POST /v1/auth/token` | 200 | 66 | `qa-b2efde56-e83d-49f0-9a32-753579ed7019` |
| 10 | `POST /v1/auth/token` | 200 | 39 | `qa-f16ebc09-131d-4b51-ae72-5e6eca400de0` |
| 9 | `POST /v1/auth/token` | 200 | 55 | `qa-ed2cb794-7dc0-4446-b737-a0b13a406419` |
| 11 | `POST /v1/auth/token` | 200 | 46 | `qa-40e7ee05-8a4f-461f-beda-b78d2485097b` |
| 16 | `POST /v1/credits/purchases` | 201 | 37 | `qa-7e34c91c-4a0a-4598-94ad-a3d8fdcc7b0b` |
| 13 | `POST /v1/credits/purchases` | 201 | 42 | `qa-99ff3019-21df-43a6-89ba-6adaa76975c2` |
| 17 | `POST /v1/credits/purchases` | 201 | 30 | `qa-2b945d48-9917-43f5-8619-402693c2097c` |
| 19 | `POST /v1/credits/purchases` | 201 | 24 | `qa-d10f2d5a-01a6-4a9d-a465-804601e8cf94` |
| 18 | `POST /v1/credits/purchases` | 201 | 27 | `qa-44c692f9-0bb9-453c-91fe-2a7c9bd359d3` |
| 12 | `POST /v1/credits/purchases` | 201 | 61 | `qa-651b73d0-0727-4436-9d23-3c905f5067e9` |
| 15 | `POST /v1/credits/purchases` | 201 | 55 | `qa-ff623cd3-8516-4200-8fde-2f707a43ad97` |
| 14 | `POST /v1/credits/purchases` | 201 | 56 | `qa-54523b13-95b5-4c1a-a00e-9a15e67d761b` |
| 21 | `POST /v1/credits/purchases` | 201 | 28 | `qa-e13f3add-a503-4668-98f4-8c9b2573e6ac` |
| 20 | `POST /v1/credits/purchases` | 201 | 56 | `qa-4da18086-95ae-43b5-9e20-e8ffde5294ed` |
| 22 | `POST /v1/auth/token` | 200 | 37 | `qa-3cf673ff-03c3-407f-8a9a-6906387e3548` |
| 23 | `GET /v1/credits/ledger` | 200 | 44 | `qa-47ec47fc-bde1-434e-ad83-9dc0b674cd6d` |
| 24 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-fc81e132-55f3-415f-95bb-41246abe3cf2` |
| 25 | `POST /v1/auth/token` | 401 | 11 | `qa-99dd1103-0872-4d5e-a8fa-9631f4be29eb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fe913b87-1163-43fd-bc06-17b6991f96b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fe913b87-1163-43fd-bc06-17b6991f96b3
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","displayName":"QA adedc2342835","password":"****","region":"us"}

--- response: 201 in 25 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-fe913b87-1163-43fd-bc06-17b6991f96b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-adedc2342835
X-Served-Region: us
Content-Length: 181

{"id":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6","handle":"qa-adedc2342835","displayName":"QA adedc2342835","region":"us","role":"user","createdAt":"2026-11-28T10:37:20.522868953Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4f015638-1e9e-4e60-a963-5489ad4a5cc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f015638-1e9e-4e60-a963-5489ad4a5cc0
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 41 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f015638-1e9e-4e60-a963-5489ad4a5cc0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-438a3fe7-ba14-4955-83a0-175b0cd02966

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-438a3fe7-ba14-4955-83a0-175b0cd02966
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-438a3fe7-ba14-4955-83a0-175b0cd02966
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-02d28031-6479-4921-bfd1-d0e45eedf2df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02d28031-6479-4921-bfd1-d0e45eedf2df
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 38 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-02d28031-6479-4921-bfd1-d0e45eedf2df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-744f86b0-722a-406b-aace-ab6904e5508c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-744f86b0-722a-406b-aace-ab6904e5508c
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-744f86b0-722a-406b-aace-ab6904e5508c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ad6c9cfa-db61-4193-b88d-4dd39eba3824

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad6c9cfa-db61-4193-b88d-4dd39eba3824
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad6c9cfa-db61-4193-b88d-4dd39eba3824
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-e6fecc85-4904-4622-bbfd-47ebcb192d35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6fecc85-4904-4622-bbfd-47ebcb192d35
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 52 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6fecc85-4904-4622-bbfd-47ebcb192d35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b2efde56-e83d-49f0-9a32-753579ed7019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2efde56-e83d-49f0-9a32-753579ed7019
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 66 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2efde56-e83d-49f0-9a32-753579ed7019
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f16ebc09-131d-4b51-ae72-5e6eca400de0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f16ebc09-131d-4b51-ae72-5e6eca400de0
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f16ebc09-131d-4b51-ae72-5e6eca400de0
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-ed2cb794-7dc0-4446-b737-a0b13a406419

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed2cb794-7dc0-4446-b737-a0b13a406419
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 55 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed2cb794-7dc0-4446-b737-a0b13a406419
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-40e7ee05-8a4f-461f-beda-b78d2485097b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40e7ee05-8a4f-461f-beda-b78d2485097b
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-40e7ee05-8a4f-461f-beda-b78d2485097b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 16. POST /v1/credits/purchases

```text
#16 POST http://localhost:7070/v1/credits/purchases
correlation: qa-7e34c91c-4a0a-4598-94ad-a3d8fdcc7b0b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8fc7dad4564c4e46a38713fd55b65af6
X-Correlation-Id: qa-7e34c91c-4a0a-4598-94ad-a3d8fdcc7b0b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e34c91c-4a0a-4598-94ad-a3d8fdcc7b0b
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_53ab707d-e321-4373-b488-47f4f85d7b9a
Content-Length: 144

{"id":"pur_53ab707d-e321-4373-b488-47f4f85d7b9a","packId":"pack-10","credits":10,"balanceAfter":35,"createdAt":"2026-11-28T10:37:20.656343725Z"}
```

## 13. POST /v1/credits/purchases

```text
#13 POST http://localhost:7070/v1/credits/purchases
correlation: qa-99ff3019-21df-43a6-89ba-6adaa76975c2

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8f79167adcd147518d1de9139628625f
X-Correlation-Id: qa-99ff3019-21df-43a6-89ba-6adaa76975c2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 42 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-99ff3019-21df-43a6-89ba-6adaa76975c2
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_9cb9773f-9ebc-46a6-97ae-ffc03cd8e86c
Content-Length: 144

{"id":"pur_9cb9773f-9ebc-46a6-97ae-ffc03cd8e86c","packId":"pack-10","credits":10,"balanceAfter":25,"createdAt":"2026-11-28T10:37:20.656024604Z"}
```

## 17. POST /v1/credits/purchases

```text
#17 POST http://localhost:7070/v1/credits/purchases
correlation: qa-2b945d48-9917-43f5-8619-402693c2097c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-3972a9b040dd4f6186d82ed9dbe66280
X-Correlation-Id: qa-2b945d48-9917-43f5-8619-402693c2097c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b945d48-9917-43f5-8619-402693c2097c
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_b59736b2-53c2-4a87-bc18-4fe2ae12c45a
Content-Length: 144

{"id":"pur_b59736b2-53c2-4a87-bc18-4fe2ae12c45a","packId":"pack-10","credits":10,"balanceAfter":45,"createdAt":"2026-11-28T10:37:20.660364620Z"}
```

## 19. POST /v1/credits/purchases

```text
#19 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d10f2d5a-01a6-4a9d-a465-804601e8cf94

--- request headers ---
Accept: application/json
Idempotency-Key: qa-8ecdf07937344a18b1e9849732196cc1
X-Correlation-Id: qa-d10f2d5a-01a6-4a9d-a465-804601e8cf94
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-d10f2d5a-01a6-4a9d-a465-804601e8cf94
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_4676eba4-dd82-46c7-94d3-a1bab5dbbefb
Content-Length: 144

{"id":"pur_4676eba4-dd82-46c7-94d3-a1bab5dbbefb","packId":"pack-10","credits":10,"balanceAfter":85,"createdAt":"2026-11-28T10:37:20.669928342Z"}
```

## 18. POST /v1/credits/purchases

```text
#18 POST http://localhost:7070/v1/credits/purchases
correlation: qa-44c692f9-0bb9-453c-91fe-2a7c9bd359d3

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0a856dce40ae4ab785a4be2f2b705f9e
X-Correlation-Id: qa-44c692f9-0bb9-453c-91fe-2a7c9bd359d3
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-44c692f9-0bb9-453c-91fe-2a7c9bd359d3
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_0730819c-9fea-4c8c-9a0c-7dbbfbd578a7
Content-Length: 144

{"id":"pur_0730819c-9fea-4c8c-9a0c-7dbbfbd578a7","packId":"pack-10","credits":10,"balanceAfter":55,"createdAt":"2026-11-28T10:37:20.661751108Z"}
```

## 12. POST /v1/credits/purchases

```text
#12 POST http://localhost:7070/v1/credits/purchases
correlation: qa-651b73d0-0727-4436-9d23-3c905f5067e9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-228e2592942b474490c6adc2a2d88b2e
X-Correlation-Id: qa-651b73d0-0727-4436-9d23-3c905f5067e9
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 61 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-651b73d0-0727-4436-9d23-3c905f5067e9
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_879a22ea-eb6f-4cc6-95b1-9fc3a7af5bd6
Content-Length: 144

{"id":"pur_879a22ea-eb6f-4cc6-95b1-9fc3a7af5bd6","packId":"pack-10","credits":10,"balanceAfter":65,"createdAt":"2026-11-28T10:37:20.662353733Z"}
```

## 15. POST /v1/credits/purchases

```text
#15 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ff623cd3-8516-4200-8fde-2f707a43ad97

--- request headers ---
Accept: application/json
Idempotency-Key: qa-06a510f2d85e49958fd64ea177dc7e10
X-Correlation-Id: qa-ff623cd3-8516-4200-8fde-2f707a43ad97
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 55 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff623cd3-8516-4200-8fde-2f707a43ad97
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_41b5e529-9280-407e-a4b5-55fa2dc77e70
Content-Length: 144

{"id":"pur_41b5e529-9280-407e-a4b5-55fa2dc77e70","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-28T10:37:20.653976398Z"}
```

## 14. POST /v1/credits/purchases

```text
#14 POST http://localhost:7070/v1/credits/purchases
correlation: qa-54523b13-95b5-4c1a-a00e-9a15e67d761b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ba779b340ec5417eb9eaddc1e7c092b7
X-Correlation-Id: qa-54523b13-95b5-4c1a-a00e-9a15e67d761b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-54523b13-95b5-4c1a-a00e-9a15e67d761b
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_c43e1468-576b-4686-8e4d-08a51fbaf59a
Content-Length: 144

{"id":"pur_c43e1468-576b-4686-8e4d-08a51fbaf59a","packId":"pack-10","credits":10,"balanceAfter":75,"createdAt":"2026-11-28T10:37:20.663615087Z"}
```

## 21. POST /v1/credits/purchases

```text
#21 POST http://localhost:7070/v1/credits/purchases
correlation: qa-e13f3add-a503-4668-98f4-8c9b2573e6ac

--- request headers ---
Accept: application/json
Idempotency-Key: qa-6d8d6bc1e8ee4326a8dce246343d1583
X-Correlation-Id: qa-e13f3add-a503-4668-98f4-8c9b2573e6ac
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 28 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e13f3add-a503-4668-98f4-8c9b2573e6ac
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_78780447-60db-4b9f-b427-1373a7ce864d
Content-Length: 144

{"id":"pur_78780447-60db-4b9f-b427-1373a7ce864d","packId":"pack-10","credits":10,"balanceAfter":95,"createdAt":"2026-11-28T10:37:20.679117238Z"}
```

## 20. POST /v1/credits/purchases

```text
#20 POST http://localhost:7070/v1/credits/purchases
correlation: qa-4da18086-95ae-43b5-9e20-e8ffde5294ed

--- request headers ---
Accept: application/json
Idempotency-Key: qa-5f0208c36faa435482d50fc83f030f80
X-Correlation-Id: qa-4da18086-95ae-43b5-9e20-e8ffde5294ed
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-4da18086-95ae-43b5-9e20-e8ffde5294ed
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
X-Served-Region: us
Location: /v1/credits/purchases/pur_0e87baa2-674c-4f57-9712-dc8177479c21
Content-Length: 145

{"id":"pur_0e87baa2-674c-4f57-9712-dc8177479c21","packId":"pack-10","credits":10,"balanceAfter":105,"createdAt":"2026-11-28T10:37:20.691071336Z"}
```

## 22. POST /v1/auth/token

```text
#22 POST http://localhost:7070/v1/auth/token
correlation: qa-3cf673ff-03c3-407f-8a9a-6906387e3548

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cf673ff-03c3-407f-8a9a-6906387e3548
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cf673ff-03c3-407f-8a9a-6906387e3548
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fc7a4a4-5e43-4eda-85b3-a48d38fa0ad6"}
```

## 23. GET /v1/credits/ledger

```text
#23 GET http://localhost:7070/v1/credits/ledger
correlation: qa-47ec47fc-bde1-434e-ad83-9dc0b674cd6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47ec47fc-bde1-434e-ad83-9dc0b674cd6d
Content-Type: application/json

--- response: 200 in 44 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-47ec47fc-bde1-434e-ad83-9dc0b674cd6d
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
X-Served-Region: us
Content-Encoding: gzip
Content-Length: 762

{"items":[{"id":"led_e189860f-1116-4c5d-9478-f641a5109087","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-28T10:37:20.522883240Z"},{"id":"led_36597658-93e0-46c7-ab77-653ad9344046","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_41b5e529-9280-407e-a4b5-55fa2dc77e70","createdAt":"2026-11-28T10:37:20.653976398Z"},{"id":"led_2a63c5d1-3d95-4d47-8a94-b4dbfcfd46c2","type":"purchase","amount":10,"balanceAfter":25,"reference":"pur_9cb9773f-9ebc-46a6-97ae-ffc03cd8e86c","createdAt":"2026-11-28T10:37:20.656024604Z"},{"id":"led_4461c6f1-4979-4cbc-b5c0-cdf4c5b22ce6","type":"purchase","amount":10,"balanceAfter":35,"reference":"pur_53ab707d-e321-4373-b488-47f4f85d7b9a","createdAt":"2026-11-28T10:37:20.656343725Z"},{"id":"led_8fd25066-11d9-4d5d-87dc-8dcc084c7313","type":"purchase","amount":10,"balanceAfter":45,"reference":"pur_b59736b2-53c2-4a87-bc18-4fe2ae12c45a","createdAt":"2026-11-28T10:37:20.660364620Z"},{"id":"led_75d4f3b7-f56b-4cc5-b9f7-d831516e8f5b","type":"purchase","amount":10,"balanceAfter":55,"reference":"pur_0730819c-9fea-4c8c-9a0c-7dbbfbd578a7","createdAt":"2026-11-28T10:37:20.661751108Z"},{"id":"led_0f0a4fe6-284a-43a8-b6cf-e5eed37e4a4b","type":"purchase","amount":10,"balanceAfter":65,"reference":"pur_879a22ea-eb6f-4cc6-95b1-9fc3a7af5bd6","createdAt":"2026-11-28T10:37:20.662353733Z"},{"id":"led_8a863d9d-f027-45c2-bc58-a3f0190e36df","type":"purchase","amount":10,"balanceAfter":75,"reference":"pur_c43e1468-576b-4686-8e4d-08a51fbaf59a","createdAt":"2026-11-28T10:37:20.663615087Z"},{"id":"led_9f67e593-5b44-450d-87de-77de5cc80503","type":"purchase","amount":10,"balanceAfter":85,"reference":"pur_4676eba4-dd82-46c7-94d3-a1bab5dbbefb","createdAt":"2026-11-28T10:37:20.669928342Z"},{"id":"led_ed1aa347-d367-4375-81e0-0963da75dfc7","type":"purchase","amount":10,"balanceAfter":95,"reference":"pur_78780447-60db-4b9f-b427-1373a7ce864d","createdAt":"2026-11-28T10:37:20.679117238Z"},{"id":"led_27f59fce-adea-4278-9769-eb7d385d7307","type":"purchase","amount":10,"balanceAfter":105,"reference":"pur_0e87baa2-674c-4f57-9712-dc8177479c21","createdAt":"2026-11-28T10:37:20.691071336Z"}],"total":11,"balance":105}
```

## 24. DELETE /v1/accounts/me

```text
#24 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fc81e132-55f3-415f-95bb-41246abe3cf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc81e132-55f3-415f-95bb-41246abe3cf2
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fc81e132-55f3-415f-95bb-41246abe3cf2
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
X-Served-Region: us
```

## 25. POST /v1/auth/token

```text
#25 POST http://localhost:7070/v1/auth/token
correlation: qa-99dd1103-0872-4d5e-a8fa-9631f4be29eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99dd1103-0872-4d5e-a8fa-9631f4be29eb
Content-Type: application/json

--- request body ---
{"handle":"qa-adedc2342835","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 28 Nov 2026 10:37:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99dd1103-0872-4d5e-a8fa-9631f4be29eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 563
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-99dd1103-0872-4d5e-a8fa-9631f4be29eb"}
```
