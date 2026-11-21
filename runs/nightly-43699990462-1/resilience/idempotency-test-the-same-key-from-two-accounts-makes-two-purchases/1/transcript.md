# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 478 | `qa-2ec47b49-305d-4fc7-bed9-dbda4173639d` |
| 2 | `POST /v1/accounts` | 201 | 28 | `qa-118b0885-402e-43f6-9f29-59cd04f00328` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-3749115e-f698-48bd-a9cb-afdeb1f18e1e` |
| 4 | `POST /v1/credits/purchases` | 201 | 56 | `qa-6ba8a6e4-0e69-445a-bba2-c4468b476c7d` |
| 5 | `POST /v1/auth/token` | 200 | 34 | `qa-10b7d451-b053-4424-b54a-ac52abedb016` |
| 6 | `POST /v1/credits/purchases` | 201 | 14 | `qa-d4b7ff16-438a-4111-b433-1af41d94bcf4` |
| 7 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-fa535e35-69a3-4c78-a10b-7a4d073507c4` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-932a4857-e42c-4941-b301-ec82c02c9318` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-ce48b61d-72e7-40a3-b898-46977e9f8252` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-445e52c9-3d4a-4c3e-bb83-f681ef236abc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2ec47b49-305d-4fc7-bed9-dbda4173639d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ec47b49-305d-4fc7-bed9-dbda4173639d
Content-Type: application/json

--- request body ---
{"handle":"qa-a5d063f43457","displayName":"QA a5d063f43457","password":"****","region":"eu"}

--- response: 201 in 478 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ec47b49-305d-4fc7-bed9-dbda4173639d
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
Location: /v1/accounts/qa-a5d063f43457
X-Served-Region: eu
Content-Length: 181

{"id":"acc_94b56c4c-499b-4ecd-bf98-80fa4f4ecb65","handle":"qa-a5d063f43457","displayName":"QA a5d063f43457","region":"eu","role":"user","createdAt":"2026-11-15T09:36:13.444463746Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-118b0885-402e-43f6-9f29-59cd04f00328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-118b0885-402e-43f6-9f29-59cd04f00328
Content-Type: application/json

--- request body ---
{"handle":"qa-b64fc4dcf99f","displayName":"QA b64fc4dcf99f","password":"****","region":"us"}

--- response: 201 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-118b0885-402e-43f6-9f29-59cd04f00328
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
Location: /v1/accounts/qa-b64fc4dcf99f
X-Served-Region: us
Content-Length: 181

{"id":"acc_5288f47e-014d-4eba-9769-ad65f5a77c36","handle":"qa-b64fc4dcf99f","displayName":"QA b64fc4dcf99f","region":"us","role":"user","createdAt":"2026-11-15T09:36:13.877297572Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3749115e-f698-48bd-a9cb-afdeb1f18e1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3749115e-f698-48bd-a9cb-afdeb1f18e1e
Content-Type: application/json

--- request body ---
{"handle":"qa-a5d063f43457","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 15 Nov 2026 09:36:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-3749115e-f698-48bd-a9cb-afdeb1f18e1e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_94b56c4c-499b-4ecd-bf98-80fa4f4ecb65"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-6ba8a6e4-0e69-445a-bba2-c4468b476c7d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c755cfc15744ecf9b2789385b8d571c
X-Correlation-Id: qa-6ba8a6e4-0e69-445a-bba2-c4468b476c7d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 56 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ba8a6e4-0e69-445a-bba2-c4468b476c7d
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
Location: /v1/credits/purchases/pur_c08f9775-62e0-4085-976f-5f284bd8ddd7
Content-Length: 144

{"id":"pur_c08f9775-62e0-4085-976f-5f284bd8ddd7","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.042675954Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-10b7d451-b053-4424-b54a-ac52abedb016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10b7d451-b053-4424-b54a-ac52abedb016
Content-Type: application/json

--- request body ---
{"handle":"qa-b64fc4dcf99f","password":"****"}

--- response: 200 in 34 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-10b7d451-b053-4424-b54a-ac52abedb016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5288f47e-014d-4eba-9769-ad65f5a77c36"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-d4b7ff16-438a-4111-b433-1af41d94bcf4

--- request headers ---
Accept: application/json
Idempotency-Key: qa-0c755cfc15744ecf9b2789385b8d571c
X-Correlation-Id: qa-d4b7ff16-438a-4111-b433-1af41d94bcf4
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4b7ff16-438a-4111-b433-1af41d94bcf4
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
Location: /v1/credits/purchases/pur_c9943050-cf40-471b-9501-229482b51a18
Content-Length: 144

{"id":"pur_c9943050-cf40-471b-9501-229482b51a18","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-15T09:36:14.169862296Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa535e35-69a3-4c78-a10b-7a4d073507c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa535e35-69a3-4c78-a10b-7a4d073507c4
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa535e35-69a3-4c78-a10b-7a4d073507c4
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-932a4857-e42c-4941-b301-ec82c02c9318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-932a4857-e42c-4941-b301-ec82c02c9318
Content-Type: application/json

--- request body ---
{"handle":"qa-b64fc4dcf99f","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-932a4857-e42c-4941-b301-ec82c02c9318
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-932a4857-e42c-4941-b301-ec82c02c9318"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ce48b61d-72e7-40a3-b898-46977e9f8252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce48b61d-72e7-40a3-b898-46977e9f8252
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ce48b61d-72e7-40a3-b898-46977e9f8252
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-445e52c9-3d4a-4c3e-bb83-f681ef236abc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-445e52c9-3d4a-4c3e-bb83-f681ef236abc
Content-Type: application/json

--- request body ---
{"handle":"qa-a5d063f43457","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-445e52c9-3d4a-4c3e-bb83-f681ef236abc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-445e52c9-3d4a-4c3e-bb83-f681ef236abc"}
```
