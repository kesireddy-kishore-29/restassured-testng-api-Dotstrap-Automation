# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-a77ad393-eb63-43c6-8d6a-3bf5d57baa20` |
| 2 | `POST /v1/auth/token` | 200 | 4 | `qa-3a01731c-2f66-4e07-af13-eabc8cb99540` |
| 3 | `GET /v1/conversations/{id}` | 404 | 14 | `qa-efae3557-4a78-4c77-be4a-ca72903a0854` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-85e7579a-f636-4660-b7ea-1d2679e4e035` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-a51dfd19-5cdd-40be-85e5-a0ef0b5f1aa1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a77ad393-eb63-43c6-8d6a-3bf5d57baa20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a77ad393-eb63-43c6-8d6a-3bf5d57baa20
Content-Type: application/json

--- request body ---
{"handle":"qa-aab2449ea247","displayName":"QA aab2449ea247","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a77ad393-eb63-43c6-8d6a-3bf5d57baa20
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 7
Location: /v1/accounts/qa-aab2449ea247
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c8946bd2-126c-494b-a244-c5ac820cbea5","handle":"qa-aab2449ea247","displayName":"QA aab2449ea247","region":"eu","role":"user","createdAt":"2026-11-22T09:54:42.634055497Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-3a01731c-2f66-4e07-af13-eabc8cb99540

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a01731c-2f66-4e07-af13-eabc8cb99540
Content-Type: application/json

--- request body ---
{"handle":"qa-aab2449ea247","password":"****"}

--- response: 200 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a01731c-2f66-4e07-af13-eabc8cb99540
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c8946bd2-126c-494b-a244-c5ac820cbea5"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-efae3557-4a78-4c77-be4a-ca72903a0854

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efae3557-4a78-4c77-be4a-ca72903a0854
Content-Type: application/json

--- response: 404 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-efae3557-4a78-4c77-be4a-ca72903a0854
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-efae3557-4a78-4c77-be4a-ca72903a0854"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85e7579a-f636-4660-b7ea-1d2679e4e035

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85e7579a-f636-4660-b7ea-1d2679e4e035
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85e7579a-f636-4660-b7ea-1d2679e4e035
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
correlation: qa-a51dfd19-5cdd-40be-85e5-a0ef0b5f1aa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a51dfd19-5cdd-40be-85e5-a0ef0b5f1aa1
Content-Type: application/json

--- request body ---
{"handle":"qa-aab2449ea247","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a51dfd19-5cdd-40be-85e5-a0ef0b5f1aa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 278
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a51dfd19-5cdd-40be-85e5-a0ef0b5f1aa1"}
```
