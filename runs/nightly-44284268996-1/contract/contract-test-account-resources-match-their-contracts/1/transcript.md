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
| 1 | `POST /v1/accounts` | 201 | 454 | `qa-e4e0ddf3-04da-4ddc-a0a5-76b3ca69ea4f` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-cac38e27-19ed-4a8f-b70a-aa6442a147f4` |
| 3 | `POST /v1/auth/token` | 200 | 63 | `qa-01b52469-060b-4c5f-b31a-2cdc318a63ad` |
| 4 | `POST /v1/auth/token` | 200 | 52 | `qa-c0fa7eca-4667-4ccd-a574-916d2a6e3afb` |
| 5 | `GET /v1/accounts/me` | 200 | 23 | `qa-974630df-e124-4eb0-93d2-fd743a5e2073` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 49 | `qa-726f0b1d-80fb-4085-b55c-5fc7545e9816` |
| 7 | `POST /v1/auth/token` | 200 | 23 | `qa-039dfe5f-7e9d-4504-b1d9-12e3b8d6ac23` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-19b06813-ee4f-4c3d-b1c9-a33ba17fd2df` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-780ff673-2c82-411c-bb65-014c733ae08c` |
| 10 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2e5bc0cd-2b62-44f6-bec8-e1e2239e873f` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-8301aeab-1980-430b-a347-a1006205f38d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e4e0ddf3-04da-4ddc-a0a5-76b3ca69ea4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4e0ddf3-04da-4ddc-a0a5-76b3ca69ea4f
Content-Type: application/json

--- request body ---
{"handle":"qa-83ea50fe164b","displayName":"QA 83ea50fe164b","password":"****","region":"eu"}

--- response: 201 in 454 ms ---
Date: Wed, 18 Nov 2026 10:19:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4e0ddf3-04da-4ddc-a0a5-76b3ca69ea4f
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
Location: /v1/accounts/qa-83ea50fe164b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_01c48332-4e1f-444a-b8e9-5fdc4d5d23cd","handle":"qa-83ea50fe164b","displayName":"QA 83ea50fe164b","region":"eu","role":"user","createdAt":"2026-11-18T10:19:48.113498855Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-cac38e27-19ed-4a8f-b70a-aa6442a147f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cac38e27-19ed-4a8f-b70a-aa6442a147f4
Content-Type: application/json

--- request body ---
{"handle":"qa-0dd928558643","displayName":"QA 0dd928558643","password":"****","region":"us"}

--- response: 201 in 54 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-cac38e27-19ed-4a8f-b70a-aa6442a147f4
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
Location: /v1/accounts/qa-0dd928558643
X-Served-Region: us
Content-Length: 181

{"id":"acc_23b33398-b809-4472-a08f-a2f4e2fabdfc","handle":"qa-0dd928558643","displayName":"QA 0dd928558643","region":"us","role":"user","createdAt":"2026-11-18T10:19:48.540533336Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-01b52469-060b-4c5f-b31a-2cdc318a63ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01b52469-060b-4c5f-b31a-2cdc318a63ad
Content-Type: application/json

--- request body ---
{"handle":"qa-83ea50fe164b","password":"****"}

--- response: 200 in 63 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-01b52469-060b-4c5f-b31a-2cdc318a63ad
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01c48332-4e1f-444a-b8e9-5fdc4d5d23cd"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c0fa7eca-4667-4ccd-a574-916d2a6e3afb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0fa7eca-4667-4ccd-a574-916d2a6e3afb
Content-Type: application/json

--- request body ---
{"handle":"qa-83ea50fe164b","password":"****"}

--- response: 200 in 52 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0fa7eca-4667-4ccd-a574-916d2a6e3afb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01c48332-4e1f-444a-b8e9-5fdc4d5d23cd"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-974630df-e124-4eb0-93d2-fd743a5e2073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-974630df-e124-4eb0-93d2-fd743a5e2073
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-974630df-e124-4eb0-93d2-fd743a5e2073
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

{"id":"acc_01c48332-4e1f-444a-b8e9-5fdc4d5d23cd","handle":"qa-83ea50fe164b","displayName":"QA 83ea50fe164b","region":"eu","role":"user","createdAt":"2026-11-18T10:19:48.113498855Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-0dd928558643
correlation: qa-726f0b1d-80fb-4085-b55c-5fc7545e9816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-726f0b1d-80fb-4085-b55c-5fc7545e9816
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-726f0b1d-80fb-4085-b55c-5fc7545e9816
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

{"handle":"qa-0dd928558643","displayName":"QA 0dd928558643","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-039dfe5f-7e9d-4504-b1d9-12e3b8d6ac23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-039dfe5f-7e9d-4504-b1d9-12e3b8d6ac23
Content-Type: application/json

--- request body ---
{"handle":"qa-0dd928558643","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-039dfe5f-7e9d-4504-b1d9-12e3b8d6ac23
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_23b33398-b809-4472-a08f-a2f4e2fabdfc"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-19b06813-ee4f-4c3d-b1c9-a33ba17fd2df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19b06813-ee4f-4c3d-b1c9-a33ba17fd2df
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-19b06813-ee4f-4c3d-b1c9-a33ba17fd2df
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
correlation: qa-780ff673-2c82-411c-bb65-014c733ae08c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-780ff673-2c82-411c-bb65-014c733ae08c
Content-Type: application/json

--- request body ---
{"handle":"qa-0dd928558643","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-780ff673-2c82-411c-bb65-014c733ae08c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-780ff673-2c82-411c-bb65-014c733ae08c"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2e5bc0cd-2b62-44f6-bec8-e1e2239e873f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e5bc0cd-2b62-44f6-bec8-e1e2239e873f
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2e5bc0cd-2b62-44f6-bec8-e1e2239e873f
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
correlation: qa-8301aeab-1980-430b-a347-a1006205f38d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8301aeab-1980-430b-a347-a1006205f38d
Content-Type: application/json

--- request body ---
{"handle":"qa-83ea50fe164b","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8301aeab-1980-430b-a347-a1006205f38d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8301aeab-1980-430b-a347-a1006205f38d"}
```
