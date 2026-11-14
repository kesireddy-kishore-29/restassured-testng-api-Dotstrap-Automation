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
| 1 | `POST /v1/accounts` | 201 | 302 | `qa-15e36d0d-e64b-4521-a73b-9ddb9fd1f115` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-c41e76c4-4d04-49aa-87f0-e5791e6eb0bd` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-06af260a-9560-43c6-a40d-5e324c22cd4a` |
| 4 | `POST /v1/credits/purchases` | 201 | 36 | `qa-fba35ffe-a245-4be2-9468-1b9762aa144b` |
| 5 | `POST /v1/auth/token` | 200 | 18 | `qa-d0219cbd-6311-42e1-bd77-8ee767d7fd7d` |
| 6 | `POST /v1/credits/purchases` | 201 | 18 | `qa-976a0cba-7226-4d23-bd2a-14b7ba3d7c78` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-341c6997-53ed-4515-b838-bc4cd9e05d72` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-e72936ad-2fed-4fd8-bc08-a1b05739126d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e7bc4eb9-8c27-4f5d-bc81-3a6475e9490a` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-6039ad90-5ea0-4135-bf6d-3e839c9db972` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15e36d0d-e64b-4521-a73b-9ddb9fd1f115

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15e36d0d-e64b-4521-a73b-9ddb9fd1f115
Content-Type: application/json

--- request body ---
{"handle":"qa-09061153349b","displayName":"QA 09061153349b","password":"****","region":"eu"}

--- response: 201 in 302 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-15e36d0d-e64b-4521-a73b-9ddb9fd1f115
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
Location: /v1/accounts/qa-09061153349b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee8d9d6b-725a-4c6b-b915-7c0d70d51922","handle":"qa-09061153349b","displayName":"QA 09061153349b","region":"eu","role":"user","createdAt":"2026-11-11T09:34:30.471576887Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c41e76c4-4d04-49aa-87f0-e5791e6eb0bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c41e76c4-4d04-49aa-87f0-e5791e6eb0bd
Content-Type: application/json

--- request body ---
{"handle":"qa-9a9d64ac4b46","displayName":"QA 9a9d64ac4b46","password":"****","region":"us"}

--- response: 201 in 33 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-c41e76c4-4d04-49aa-87f0-e5791e6eb0bd
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
Location: /v1/accounts/qa-9a9d64ac4b46
X-Served-Region: us
Content-Length: 181

{"id":"acc_c3fffac8-6066-4c0d-b858-27152695aeff","handle":"qa-9a9d64ac4b46","displayName":"QA 9a9d64ac4b46","region":"us","role":"user","createdAt":"2026-11-11T09:34:30.782942415Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-06af260a-9560-43c6-a40d-5e324c22cd4a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06af260a-9560-43c6-a40d-5e324c22cd4a
Content-Type: application/json

--- request body ---
{"handle":"qa-09061153349b","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-06af260a-9560-43c6-a40d-5e324c22cd4a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee8d9d6b-725a-4c6b-b915-7c0d70d51922"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-fba35ffe-a245-4be2-9468-1b9762aa144b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a5c812f127aa40fb9a5a3467540b093e
X-Correlation-Id: qa-fba35ffe-a245-4be2-9468-1b9762aa144b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-fba35ffe-a245-4be2-9468-1b9762aa144b
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
Location: /v1/credits/purchases/pur_1b8a8abb-268c-43c8-8b88-59a65d728705
Content-Length: 144

{"id":"pur_1b8a8abb-268c-43c8-8b88-59a65d728705","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.873687068Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d0219cbd-6311-42e1-bd77-8ee767d7fd7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0219cbd-6311-42e1-bd77-8ee767d7fd7d
Content-Type: application/json

--- request body ---
{"handle":"qa-9a9d64ac4b46","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0219cbd-6311-42e1-bd77-8ee767d7fd7d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c3fffac8-6066-4c0d-b858-27152695aeff"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-976a0cba-7226-4d23-bd2a-14b7ba3d7c78

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a5c812f127aa40fb9a5a3467540b093e
X-Correlation-Id: qa-976a0cba-7226-4d23-bd2a-14b7ba3d7c78
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-976a0cba-7226-4d23-bd2a-14b7ba3d7c78
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
Location: /v1/credits/purchases/pur_d741ae43-d323-4b16-b2ea-42f118e34be8
Content-Length: 144

{"id":"pur_d741ae43-d323-4b16-b2ea-42f118e34be8","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-11T09:34:30.964057733Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-341c6997-53ed-4515-b838-bc4cd9e05d72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-341c6997-53ed-4515-b838-bc4cd9e05d72
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-341c6997-53ed-4515-b838-bc4cd9e05d72
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
correlation: qa-e72936ad-2fed-4fd8-bc08-a1b05739126d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e72936ad-2fed-4fd8-bc08-a1b05739126d
Content-Type: application/json

--- request body ---
{"handle":"qa-9a9d64ac4b46","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e72936ad-2fed-4fd8-bc08-a1b05739126d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e72936ad-2fed-4fd8-bc08-a1b05739126d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7bc4eb9-8c27-4f5d-bc81-3a6475e9490a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7bc4eb9-8c27-4f5d-bc81-3a6475e9490a
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7bc4eb9-8c27-4f5d-bc81-3a6475e9490a
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
correlation: qa-6039ad90-5ea0-4135-bf6d-3e839c9db972

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6039ad90-5ea0-4135-bf6d-3e839c9db972
Content-Type: application/json

--- request body ---
{"handle":"qa-09061153349b","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 11 Nov 2026 09:34:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6039ad90-5ea0-4135-bf6d-3e839c9db972
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6039ad90-5ea0-4135-bf6d-3e839c9db972"}
```
