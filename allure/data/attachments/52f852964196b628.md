# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-6ba34641-f100-4c94-b37a-0a5ef972fa79` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-3b3f2c26-e0b0-422f-aee0-30374938439c` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 14 | `qa-68e22644-7d7a-477d-ad8f-749381d5b0e5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-75f6f27a-ea33-42b5-af83-98b242d19ed1` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-e1ebeac4-b8e8-4dc6-bca7-df0e898404ce` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6ba34641-f100-4c94-b37a-0a5ef972fa79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ba34641-f100-4c94-b37a-0a5ef972fa79
Content-Type: application/json

--- request body ---
{"handle":"qa-5e9d6836327a","displayName":"QA 5e9d6836327a","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ba34641-f100-4c94-b37a-0a5ef972fa79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 6
Location: /v1/accounts/qa-5e9d6836327a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_404fd688-dca1-48f8-b7b5-13ceaeadb218","handle":"qa-5e9d6836327a","displayName":"QA 5e9d6836327a","region":"eu","role":"user","createdAt":"2026-11-28T10:37:26.229788801Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3b3f2c26-e0b0-422f-aee0-30374938439c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b3f2c26-e0b0-422f-aee0-30374938439c
Content-Type: application/json

--- request body ---
{"handle":"qa-5e9d6836327a","password":"****"}

--- response: 200 in 23 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b3f2c26-e0b0-422f-aee0-30374938439c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_404fd688-dca1-48f8-b7b5-13ceaeadb218"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-68e22644-7d7a-477d-ad8f-749381d5b0e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68e22644-7d7a-477d-ad8f-749381d5b0e5
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68e22644-7d7a-477d-ad8f-749381d5b0e5
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
Content-Length: 258

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-68e22644-7d7a-477d-ad8f-749381d5b0e5"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-75f6f27a-ea33-42b5-af83-98b242d19ed1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75f6f27a-ea33-42b5-af83-98b242d19ed1
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-75f6f27a-ea33-42b5-af83-98b242d19ed1
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e1ebeac4-b8e8-4dc6-bca7-df0e898404ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1ebeac4-b8e8-4dc6-bca7-df0e898404ce
Content-Type: application/json

--- request body ---
{"handle":"qa-5e9d6836327a","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 28 Nov 2026 10:37:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1ebeac4-b8e8-4dc6-bca7-df0e898404ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1ebeac4-b8e8-4dc6-bca7-df0e898404ce"}
```
