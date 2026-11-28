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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-b1a186ef-c36d-4895-b1d5-5ed55207ae1b` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-6f202302-db07-4fdb-a7a4-f4e6ccb8d782` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-dcf9111d-f545-4f9b-80ab-1b7ac7794034` |
| 4 | `POST /v1/auth/token` | 200 | 26 | `qa-7a1e64f2-e127-4196-824b-780d468c7e46` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-b0bb2d64-dfec-4c27-91fa-383034d3b32c` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 18 | `qa-e1d44afa-b2d0-4a99-b075-d0a7e90a7b95` |
| 7 | `POST /v1/auth/token` | 200 | 17 | `qa-02efabce-d04b-4611-9833-0f69bf785b91` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b615780d-820a-4996-9a50-ef01b33c4cdb` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-e796661c-e4e8-4357-918f-1ca2eb0a33e6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-e53f0b52-e4c3-4392-803b-892f5fa41cbc` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-f3fe4d1c-a3a0-408a-8e97-5e44c5e4884e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b1a186ef-c36d-4895-b1d5-5ed55207ae1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1a186ef-c36d-4895-b1d5-5ed55207ae1b
Content-Type: application/json

--- request body ---
{"handle":"qa-a0d11949860c","displayName":"QA a0d11949860c","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1a186ef-c36d-4895-b1d5-5ed55207ae1b
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
Location: /v1/accounts/qa-a0d11949860c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a724ba8e-b9c4-489f-9e02-726362325269","handle":"qa-a0d11949860c","displayName":"QA a0d11949860c","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.877145685Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6f202302-db07-4fdb-a7a4-f4e6ccb8d782

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f202302-db07-4fdb-a7a4-f4e6ccb8d782
Content-Type: application/json

--- request body ---
{"handle":"qa-fae555f1869b","displayName":"QA fae555f1869b","password":"****","region":"us"}

--- response: 201 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f202302-db07-4fdb-a7a4-f4e6ccb8d782
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
Location: /v1/accounts/qa-fae555f1869b
X-Served-Region: us
Content-Length: 181

{"id":"acc_cc84d865-cef7-4c9a-934e-dffca3454b1a","handle":"qa-fae555f1869b","displayName":"QA fae555f1869b","region":"us","role":"user","createdAt":"2026-11-28T10:37:15.911516830Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dcf9111d-f545-4f9b-80ab-1b7ac7794034

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcf9111d-f545-4f9b-80ab-1b7ac7794034
Content-Type: application/json

--- request body ---
{"handle":"qa-a0d11949860c","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcf9111d-f545-4f9b-80ab-1b7ac7794034
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a724ba8e-b9c4-489f-9e02-726362325269"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-7a1e64f2-e127-4196-824b-780d468c7e46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a1e64f2-e127-4196-824b-780d468c7e46
Content-Type: application/json

--- request body ---
{"handle":"qa-a0d11949860c","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 28 Nov 2026 10:37:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a1e64f2-e127-4196-824b-780d468c7e46
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a724ba8e-b9c4-489f-9e02-726362325269"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0bb2d64-dfec-4c27-91fa-383034d3b32c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0bb2d64-dfec-4c27-91fa-383034d3b32c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0bb2d64-dfec-4c27-91fa-383034d3b32c
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

{"id":"acc_a724ba8e-b9c4-489f-9e02-726362325269","handle":"qa-a0d11949860c","displayName":"QA a0d11949860c","region":"eu","role":"user","createdAt":"2026-11-28T10:37:15.877145685Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-fae555f1869b
correlation: qa-e1d44afa-b2d0-4a99-b075-d0a7e90a7b95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1d44afa-b2d0-4a99-b075-d0a7e90a7b95
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1d44afa-b2d0-4a99-b075-d0a7e90a7b95
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

{"handle":"qa-fae555f1869b","displayName":"QA fae555f1869b","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-02efabce-d04b-4611-9833-0f69bf785b91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02efabce-d04b-4611-9833-0f69bf785b91
Content-Type: application/json

--- request body ---
{"handle":"qa-fae555f1869b","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-02efabce-d04b-4611-9833-0f69bf785b91
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc84d865-cef7-4c9a-934e-dffca3454b1a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b615780d-820a-4996-9a50-ef01b33c4cdb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b615780d-820a-4996-9a50-ef01b33c4cdb
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b615780d-820a-4996-9a50-ef01b33c4cdb
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
correlation: qa-e796661c-e4e8-4357-918f-1ca2eb0a33e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e796661c-e4e8-4357-918f-1ca2eb0a33e6
Content-Type: application/json

--- request body ---
{"handle":"qa-fae555f1869b","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e796661c-e4e8-4357-918f-1ca2eb0a33e6
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e796661c-e4e8-4357-918f-1ca2eb0a33e6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e53f0b52-e4c3-4392-803b-892f5fa41cbc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e53f0b52-e4c3-4392-803b-892f5fa41cbc
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e53f0b52-e4c3-4392-803b-892f5fa41cbc
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
correlation: qa-f3fe4d1c-a3a0-408a-8e97-5e44c5e4884e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3fe4d1c-a3a0-408a-8e97-5e44c5e4884e
Content-Type: application/json

--- request body ---
{"handle":"qa-a0d11949860c","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 28 Nov 2026 10:37:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3fe4d1c-a3a0-408a-8e97-5e44c5e4884e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f3fe4d1c-a3a0-408a-8e97-5e44c5e4884e"}
```
