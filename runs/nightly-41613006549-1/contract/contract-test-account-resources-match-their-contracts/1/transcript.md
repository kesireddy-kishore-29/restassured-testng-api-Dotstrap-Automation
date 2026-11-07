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
| 1 | `POST /v1/accounts` | 201 | 424 | `qa-c59c1547-ded1-466a-b027-0b1e73629b3c` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-b369b65a-57a5-4e35-8bcb-9cd070081d65` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-45e54733-12a2-4c2c-bb1e-c66f84be993a` |
| 4 | `POST /v1/auth/token` | 200 | 32 | `qa-370130e6-427b-4d39-8a54-33c5ae6f7ee2` |
| 5 | `GET /v1/accounts/me` | 200 | 18 | `qa-40700c61-a312-43d6-ad4b-f7773ed65941` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 43 | `qa-f1d55032-4677-49d9-bc2f-76f9c9603a32` |
| 7 | `POST /v1/auth/token` | 200 | 34 | `qa-e498f1d0-01c2-473a-88e2-d8f1d6b33c18` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d672f847-5612-4d71-a520-b9d5ede09934` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-8d03cf31-9495-4720-bec4-e1bdd75f8a27` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-8e226945-0c81-49f8-8d29-93a02078cf41` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-db9968ea-177f-4261-9813-1e94ca212466` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c59c1547-ded1-466a-b027-0b1e73629b3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c59c1547-ded1-466a-b027-0b1e73629b3c
Content-Type: application/json

--- request body ---
{"handle":"qa-195f8fdb420a","displayName":"QA 195f8fdb420a","password":"****","region":"eu"}

--- response: 201 in 424 ms ---
Date: Tue, 03 Nov 2026 09:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-c59c1547-ded1-466a-b027-0b1e73629b3c
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
Location: /v1/accounts/qa-195f8fdb420a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d78eb239-07d9-4915-b44a-b474595e1506","handle":"qa-195f8fdb420a","displayName":"QA 195f8fdb420a","region":"eu","role":"user","createdAt":"2026-11-03T09:41:44.498615699Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b369b65a-57a5-4e35-8bcb-9cd070081d65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b369b65a-57a5-4e35-8bcb-9cd070081d65
Content-Type: application/json

--- request body ---
{"handle":"qa-1a2e24ced5ec","displayName":"QA 1a2e24ced5ec","password":"****","region":"us"}

--- response: 201 in 50 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-b369b65a-57a5-4e35-8bcb-9cd070081d65
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
Location: /v1/accounts/qa-1a2e24ced5ec
X-Served-Region: us
Content-Length: 181

{"id":"acc_9879de53-2f6a-4c87-b2b9-1549d5f5cc36","handle":"qa-1a2e24ced5ec","displayName":"QA 1a2e24ced5ec","region":"us","role":"user","createdAt":"2026-11-03T09:41:45.059048987Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-45e54733-12a2-4c2c-bb1e-c66f84be993a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45e54733-12a2-4c2c-bb1e-c66f84be993a
Content-Type: application/json

--- request body ---
{"handle":"qa-195f8fdb420a","password":"****"}

--- response: 200 in 42 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-45e54733-12a2-4c2c-bb1e-c66f84be993a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d78eb239-07d9-4915-b44a-b474595e1506"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-370130e6-427b-4d39-8a54-33c5ae6f7ee2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-370130e6-427b-4d39-8a54-33c5ae6f7ee2
Content-Type: application/json

--- request body ---
{"handle":"qa-195f8fdb420a","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-370130e6-427b-4d39-8a54-33c5ae6f7ee2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d78eb239-07d9-4915-b44a-b474595e1506"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-40700c61-a312-43d6-ad4b-f7773ed65941

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40700c61-a312-43d6-ad4b-f7773ed65941
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-40700c61-a312-43d6-ad4b-f7773ed65941
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

{"id":"acc_d78eb239-07d9-4915-b44a-b474595e1506","handle":"qa-195f8fdb420a","displayName":"QA 195f8fdb420a","region":"eu","role":"user","createdAt":"2026-11-03T09:41:44.498615699Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-1a2e24ced5ec
correlation: qa-f1d55032-4677-49d9-bc2f-76f9c9603a32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1d55032-4677-49d9-bc2f-76f9c9603a32
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1d55032-4677-49d9-bc2f-76f9c9603a32
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

{"handle":"qa-1a2e24ced5ec","displayName":"QA 1a2e24ced5ec","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-e498f1d0-01c2-473a-88e2-d8f1d6b33c18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e498f1d0-01c2-473a-88e2-d8f1d6b33c18
Content-Type: application/json

--- request body ---
{"handle":"qa-1a2e24ced5ec","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-e498f1d0-01c2-473a-88e2-d8f1d6b33c18
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9879de53-2f6a-4c87-b2b9-1549d5f5cc36"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d672f847-5612-4d71-a520-b9d5ede09934

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d672f847-5612-4d71-a520-b9d5ede09934
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d672f847-5612-4d71-a520-b9d5ede09934
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
correlation: qa-8d03cf31-9495-4720-bec4-e1bdd75f8a27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d03cf31-9495-4720-bec4-e1bdd75f8a27
Content-Type: application/json

--- request body ---
{"handle":"qa-1a2e24ced5ec","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8d03cf31-9495-4720-bec4-e1bdd75f8a27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8d03cf31-9495-4720-bec4-e1bdd75f8a27"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e226945-0c81-49f8-8d29-93a02078cf41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e226945-0c81-49f8-8d29-93a02078cf41
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e226945-0c81-49f8-8d29-93a02078cf41
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
correlation: qa-db9968ea-177f-4261-9813-1e94ca212466

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db9968ea-177f-4261-9813-1e94ca212466
Content-Type: application/json

--- request body ---
{"handle":"qa-195f8fdb420a","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db9968ea-177f-4261-9813-1e94ca212466
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db9968ea-177f-4261-9813-1e94ca212466"}
```
