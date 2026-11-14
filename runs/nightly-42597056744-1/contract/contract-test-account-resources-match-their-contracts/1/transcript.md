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
| 1 | `POST /v1/accounts` | 201 | 423 | `qa-edfe05fb-b4c0-45a6-ae28-81544ef6d758` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-53207f44-d51c-4e6b-a03f-556852b13d25` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-3cd9196d-2671-47e7-9947-c39ea6f70dba` |
| 4 | `POST /v1/auth/token` | 200 | 25 | `qa-f6cc2873-ff3a-4929-999c-e90cd6a48bfd` |
| 5 | `GET /v1/accounts/me` | 200 | 19 | `qa-8de55593-611d-46f7-a801-b82399818ba4` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 37 | `qa-0e96115c-c8a7-42cb-8ed3-87a50c4c0852` |
| 7 | `POST /v1/auth/token` | 200 | 24 | `qa-5ed85034-15b9-4fe5-bc43-18bec0d2ccab` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4c60fe94-4f7d-42c6-9ab4-e45ccecd882c` |
| 9 | `POST /v1/auth/token` | 401 | 14 | `qa-cecce04b-3af1-431b-a5f5-bc273cccb1e2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-af5f61aa-1c2d-4cf9-836c-cb1f19883c15` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-745bf333-2a85-4d21-9b78-b6f1c001a056` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-edfe05fb-b4c0-45a6-ae28-81544ef6d758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edfe05fb-b4c0-45a6-ae28-81544ef6d758
Content-Type: application/json

--- request body ---
{"handle":"qa-7e835d9383e3","displayName":"QA 7e835d9383e3","password":"****","region":"eu"}

--- response: 201 in 423 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-edfe05fb-b4c0-45a6-ae28-81544ef6d758
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
Location: /v1/accounts/qa-7e835d9383e3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_62b909e5-c5e8-4379-88c2-7e7efaa093ee","handle":"qa-7e835d9383e3","displayName":"QA 7e835d9383e3","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.944307316Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-53207f44-d51c-4e6b-a03f-556852b13d25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53207f44-d51c-4e6b-a03f-556852b13d25
Content-Type: application/json

--- request body ---
{"handle":"qa-114e266d06ae","displayName":"QA 114e266d06ae","password":"****","region":"us"}

--- response: 201 in 58 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-53207f44-d51c-4e6b-a03f-556852b13d25
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
Location: /v1/accounts/qa-114e266d06ae
X-Served-Region: us
Content-Length: 181

{"id":"acc_726287e5-dd0f-4799-96ce-938dbf62a751","handle":"qa-114e266d06ae","displayName":"QA 114e266d06ae","region":"us","role":"user","createdAt":"2026-11-09T09:55:59.362063658Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3cd9196d-2671-47e7-9947-c39ea6f70dba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3cd9196d-2671-47e7-9947-c39ea6f70dba
Content-Type: application/json

--- request body ---
{"handle":"qa-7e835d9383e3","password":"****"}

--- response: 200 in 50 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3cd9196d-2671-47e7-9947-c39ea6f70dba
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62b909e5-c5e8-4379-88c2-7e7efaa093ee"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-f6cc2873-ff3a-4929-999c-e90cd6a48bfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6cc2873-ff3a-4929-999c-e90cd6a48bfd
Content-Type: application/json

--- request body ---
{"handle":"qa-7e835d9383e3","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6cc2873-ff3a-4929-999c-e90cd6a48bfd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_62b909e5-c5e8-4379-88c2-7e7efaa093ee"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-8de55593-611d-46f7-a801-b82399818ba4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8de55593-611d-46f7-a801-b82399818ba4
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-8de55593-611d-46f7-a801-b82399818ba4
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

{"id":"acc_62b909e5-c5e8-4379-88c2-7e7efaa093ee","handle":"qa-7e835d9383e3","displayName":"QA 7e835d9383e3","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.944307316Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-114e266d06ae
correlation: qa-0e96115c-c8a7-42cb-8ed3-87a50c4c0852

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e96115c-c8a7-42cb-8ed3-87a50c4c0852
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e96115c-c8a7-42cb-8ed3-87a50c4c0852
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

{"handle":"qa-114e266d06ae","displayName":"QA 114e266d06ae","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-5ed85034-15b9-4fe5-bc43-18bec0d2ccab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ed85034-15b9-4fe5-bc43-18bec0d2ccab
Content-Type: application/json

--- request body ---
{"handle":"qa-114e266d06ae","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ed85034-15b9-4fe5-bc43-18bec0d2ccab
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_726287e5-dd0f-4799-96ce-938dbf62a751"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4c60fe94-4f7d-42c6-9ab4-e45ccecd882c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c60fe94-4f7d-42c6-9ab4-e45ccecd882c
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4c60fe94-4f7d-42c6-9ab4-e45ccecd882c
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
correlation: qa-cecce04b-3af1-431b-a5f5-bc273cccb1e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cecce04b-3af1-431b-a5f5-bc273cccb1e2
Content-Type: application/json

--- request body ---
{"handle":"qa-114e266d06ae","password":"****"}

--- response: 401 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cecce04b-3af1-431b-a5f5-bc273cccb1e2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cecce04b-3af1-431b-a5f5-bc273cccb1e2"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-af5f61aa-1c2d-4cf9-836c-cb1f19883c15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af5f61aa-1c2d-4cf9-836c-cb1f19883c15
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-af5f61aa-1c2d-4cf9-836c-cb1f19883c15
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
correlation: qa-745bf333-2a85-4d21-9b78-b6f1c001a056

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-745bf333-2a85-4d21-9b78-b6f1c001a056
Content-Type: application/json

--- request body ---
{"handle":"qa-7e835d9383e3","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-745bf333-2a85-4d21-9b78-b6f1c001a056
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-745bf333-2a85-4d21-9b78-b6f1c001a056"}
```
