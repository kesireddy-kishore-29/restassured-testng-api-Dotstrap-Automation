# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 344 | `qa-a240ceea-fcad-47d4-aabc-f4b550893702` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-7489186b-60c9-45d1-9878-f184fe4ba4bd` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-f6307e76-efff-4095-b3b6-9c146bb76c5c` |
| 4 | `POST /v1/auth/token` | 200 | 18 | `qa-27806fbe-98f9-43ca-93a5-37cfe79d29da` |
| 5 | `GET /v1/accounts/me` | 200 | 19 | `qa-04a562fd-51e6-4c03-8842-ed04e0224a8d` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 35 | `qa-5874dd0d-bbf3-4daf-a68e-84892956dab5` |
| 7 | `POST /v1/auth/token` | 200 | 23 | `qa-3d24704d-88f5-4ac3-a669-1ac81429f69d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-8a466339-e5fb-4d6b-be9e-6fca922d6cc4` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-9a80a4bd-8610-4485-908e-8ffb44af0962` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-338a4dc3-e32d-4ff6-b885-32ac560b7efc` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-b8bb7085-54b2-4a65-9d35-a0b98dcb3fa2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a240ceea-fcad-47d4-aabc-f4b550893702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a240ceea-fcad-47d4-aabc-f4b550893702
Content-Type: application/json

--- request body ---
{"handle":"qa-542a9496353e","displayName":"QA 542a9496353e","password":"****","region":"eu"}

--- response: 201 in 344 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-a240ceea-fcad-47d4-aabc-f4b550893702
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-542a9496353e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8096b073-583f-4e2a-9ac4-cb6b2dc609c2","handle":"qa-542a9496353e","displayName":"QA 542a9496353e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.539818741Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7489186b-60c9-45d1-9878-f184fe4ba4bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7489186b-60c9-45d1-9878-f184fe4ba4bd
Content-Type: application/json

--- request body ---
{"handle":"qa-fcd22fca7b4e","displayName":"QA fcd22fca7b4e","password":"****","region":"us"}

--- response: 201 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-7489186b-60c9-45d1-9878-f184fe4ba4bd
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
Location: /v1/accounts/qa-fcd22fca7b4e
X-Served-Region: us
Content-Length: 181

{"id":"acc_c4653cd6-5604-498d-8aa6-ebe5e8e37462","handle":"qa-fcd22fca7b4e","displayName":"QA fcd22fca7b4e","region":"us","role":"user","createdAt":"2026-11-04T09:28:13.887718082Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f6307e76-efff-4095-b3b6-9c146bb76c5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6307e76-efff-4095-b3b6-9c146bb76c5c
Content-Type: application/json

--- request body ---
{"handle":"qa-542a9496353e","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6307e76-efff-4095-b3b6-9c146bb76c5c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8096b073-583f-4e2a-9ac4-cb6b2dc609c2"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-27806fbe-98f9-43ca-93a5-37cfe79d29da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27806fbe-98f9-43ca-93a5-37cfe79d29da
Content-Type: application/json

--- request body ---
{"handle":"qa-542a9496353e","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-27806fbe-98f9-43ca-93a5-37cfe79d29da
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8096b073-583f-4e2a-9ac4-cb6b2dc609c2"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-04a562fd-51e6-4c03-8842-ed04e0224a8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04a562fd-51e6-4c03-8842-ed04e0224a8d
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-04a562fd-51e6-4c03-8842-ed04e0224a8d
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
Content-Length: 181

{"id":"acc_8096b073-583f-4e2a-9ac4-cb6b2dc609c2","handle":"qa-542a9496353e","displayName":"QA 542a9496353e","region":"eu","role":"user","createdAt":"2026-11-04T09:28:13.539818741Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-fcd22fca7b4e
correlation: qa-5874dd0d-bbf3-4daf-a68e-84892956dab5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5874dd0d-bbf3-4daf-a68e-84892956dab5
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-5874dd0d-bbf3-4daf-a68e-84892956dab5
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
Content-Length: 74

{"handle":"qa-fcd22fca7b4e","displayName":"QA fcd22fca7b4e","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-3d24704d-88f5-4ac3-a669-1ac81429f69d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d24704d-88f5-4ac3-a669-1ac81429f69d
Content-Type: application/json

--- request body ---
{"handle":"qa-fcd22fca7b4e","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d24704d-88f5-4ac3-a669-1ac81429f69d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c4653cd6-5604-498d-8aa6-ebe5e8e37462"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8a466339-e5fb-4d6b-be9e-6fca922d6cc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a466339-e5fb-4d6b-be9e-6fca922d6cc4
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8a466339-e5fb-4d6b-be9e-6fca922d6cc4
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-9a80a4bd-8610-4485-908e-8ffb44af0962

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a80a4bd-8610-4485-908e-8ffb44af0962
Content-Type: application/json

--- request body ---
{"handle":"qa-fcd22fca7b4e","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a80a4bd-8610-4485-908e-8ffb44af0962
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9a80a4bd-8610-4485-908e-8ffb44af0962"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-338a4dc3-e32d-4ff6-b885-32ac560b7efc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-338a4dc3-e32d-4ff6-b885-32ac560b7efc
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-338a4dc3-e32d-4ff6-b885-32ac560b7efc
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
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-b8bb7085-54b2-4a65-9d35-a0b98dcb3fa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8bb7085-54b2-4a65-9d35-a0b98dcb3fa2
Content-Type: application/json

--- request body ---
{"handle":"qa-542a9496353e","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8bb7085-54b2-4a65-9d35-a0b98dcb3fa2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8bb7085-54b2-4a65-9d35-a0b98dcb3fa2"}
```
