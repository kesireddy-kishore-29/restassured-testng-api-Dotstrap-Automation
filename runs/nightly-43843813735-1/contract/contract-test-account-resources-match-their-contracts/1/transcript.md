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
| 1 | `POST /v1/accounts` | 201 | 353 | `qa-da932c5f-e0e6-4523-a317-9a555bc0207b` |
| 2 | `POST /v1/accounts` | 201 | 27 | `qa-dd424015-c908-4055-b69c-d78fae0d48fb` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-0a23293b-82e8-4b98-9a1b-f62988f6f340` |
| 4 | `POST /v1/auth/token` | 200 | 16 | `qa-0c015d96-bd08-40c9-9e1e-fe5e19452367` |
| 5 | `GET /v1/accounts/me` | 200 | 25 | `qa-43bd1d91-21bb-44d2-abe5-54cda3b4538b` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 28 | `qa-1ea93b3f-bd99-4449-abad-06d014df3576` |
| 7 | `POST /v1/auth/token` | 200 | 9 | `qa-d6b3c6f2-2eb2-436d-bb87-9af204922b8e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-19dcb100-504c-46e3-8f65-51a24ef6d043` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-d81008c0-4ed7-46d0-8e71-35d4f0c64865` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-59c95a4f-a6bb-4fc9-a7e5-56a117dd7615` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-a1c7df3f-2fa1-41b6-85a6-9f3f408d8ef5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-da932c5f-e0e6-4523-a317-9a555bc0207b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da932c5f-e0e6-4523-a317-9a555bc0207b
Content-Type: application/json

--- request body ---
{"handle":"qa-06c72163f794","displayName":"QA 06c72163f794","password":"****","region":"eu"}

--- response: 201 in 353 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-da932c5f-e0e6-4523-a317-9a555bc0207b
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
Location: /v1/accounts/qa-06c72163f794
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54d3e53a-2798-44fe-b17a-af7b8120e65d","handle":"qa-06c72163f794","displayName":"QA 06c72163f794","region":"eu","role":"user","createdAt":"2026-11-16T09:53:50.486210706Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-dd424015-c908-4055-b69c-d78fae0d48fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd424015-c908-4055-b69c-d78fae0d48fb
Content-Type: application/json

--- request body ---
{"handle":"qa-168491d198df","displayName":"QA 168491d198df","password":"****","region":"us"}

--- response: 201 in 27 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd424015-c908-4055-b69c-d78fae0d48fb
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
Location: /v1/accounts/qa-168491d198df
X-Served-Region: us
Content-Length: 181

{"id":"acc_2aec4774-e600-4eec-bdfe-22ed4ffc35e4","handle":"qa-168491d198df","displayName":"QA 168491d198df","region":"us","role":"user","createdAt":"2026-11-16T09:53:50.832310337Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0a23293b-82e8-4b98-9a1b-f62988f6f340

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a23293b-82e8-4b98-9a1b-f62988f6f340
Content-Type: application/json

--- request body ---
{"handle":"qa-06c72163f794","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a23293b-82e8-4b98-9a1b-f62988f6f340
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54d3e53a-2798-44fe-b17a-af7b8120e65d"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0c015d96-bd08-40c9-9e1e-fe5e19452367

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c015d96-bd08-40c9-9e1e-fe5e19452367
Content-Type: application/json

--- request body ---
{"handle":"qa-06c72163f794","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c015d96-bd08-40c9-9e1e-fe5e19452367
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54d3e53a-2798-44fe-b17a-af7b8120e65d"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-43bd1d91-21bb-44d2-abe5-54cda3b4538b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43bd1d91-21bb-44d2-abe5-54cda3b4538b
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-43bd1d91-21bb-44d2-abe5-54cda3b4538b
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

{"id":"acc_54d3e53a-2798-44fe-b17a-af7b8120e65d","handle":"qa-06c72163f794","displayName":"QA 06c72163f794","region":"eu","role":"user","createdAt":"2026-11-16T09:53:50.486210706Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-168491d198df
correlation: qa-1ea93b3f-bd99-4449-abad-06d014df3576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ea93b3f-bd99-4449-abad-06d014df3576
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ea93b3f-bd99-4449-abad-06d014df3576
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

{"handle":"qa-168491d198df","displayName":"QA 168491d198df","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-d6b3c6f2-2eb2-436d-bb87-9af204922b8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6b3c6f2-2eb2-436d-bb87-9af204922b8e
Content-Type: application/json

--- request body ---
{"handle":"qa-168491d198df","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6b3c6f2-2eb2-436d-bb87-9af204922b8e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2aec4774-e600-4eec-bdfe-22ed4ffc35e4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19dcb100-504c-46e3-8f65-51a24ef6d043

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19dcb100-504c-46e3-8f65-51a24ef6d043
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19dcb100-504c-46e3-8f65-51a24ef6d043
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
correlation: qa-d81008c0-4ed7-46d0-8e71-35d4f0c64865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d81008c0-4ed7-46d0-8e71-35d4f0c64865
Content-Type: application/json

--- request body ---
{"handle":"qa-168491d198df","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d81008c0-4ed7-46d0-8e71-35d4f0c64865
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d81008c0-4ed7-46d0-8e71-35d4f0c64865"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-59c95a4f-a6bb-4fc9-a7e5-56a117dd7615

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59c95a4f-a6bb-4fc9-a7e5-56a117dd7615
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-59c95a4f-a6bb-4fc9-a7e5-56a117dd7615
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
correlation: qa-a1c7df3f-2fa1-41b6-85a6-9f3f408d8ef5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1c7df3f-2fa1-41b6-85a6-9f3f408d8ef5
Content-Type: application/json

--- request body ---
{"handle":"qa-06c72163f794","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1c7df3f-2fa1-41b6-85a6-9f3f408d8ef5
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a1c7df3f-2fa1-41b6-85a6-9f3f408d8ef5"}
```
