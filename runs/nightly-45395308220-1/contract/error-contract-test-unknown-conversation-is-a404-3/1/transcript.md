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
| 1 | `POST /v1/accounts` | 201 | 23 | `qa-2fa6a55f-c31f-4d05-b718-4def05a0efa7` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-245a807d-f567-4759-8014-2d68668b9935` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 13 | `qa-a78682a4-1429-4add-b568-c363e29afa7b` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-f70328d8-cebb-4d1d-826a-51605c056875` |
| 5 | `POST /v1/auth/token` | 401 | 13 | `qa-1a26d6e1-185c-438f-8b72-1cecc2d6286b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2fa6a55f-c31f-4d05-b718-4def05a0efa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fa6a55f-c31f-4d05-b718-4def05a0efa7
Content-Type: application/json

--- request body ---
{"handle":"qa-05b8fb72e5ac","displayName":"QA 05b8fb72e5ac","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fa6a55f-c31f-4d05-b718-4def05a0efa7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 7
Location: /v1/accounts/qa-05b8fb72e5ac
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2c4cb544-f2ec-4404-925f-a27f6e0b6994","handle":"qa-05b8fb72e5ac","displayName":"QA 05b8fb72e5ac","region":"eu","role":"user","createdAt":"2026-11-24T12:38:16.130933588Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-245a807d-f567-4759-8014-2d68668b9935

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-245a807d-f567-4759-8014-2d68668b9935
Content-Type: application/json

--- request body ---
{"handle":"qa-05b8fb72e5ac","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-245a807d-f567-4759-8014-2d68668b9935
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c4cb544-f2ec-4404-925f-a27f6e0b6994"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-a78682a4-1429-4add-b568-c363e29afa7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a78682a4-1429-4add-b568-c363e29afa7b
Content-Type: application/json

--- response: 404 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a78682a4-1429-4add-b568-c363e29afa7b
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-a78682a4-1429-4add-b568-c363e29afa7b"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f70328d8-cebb-4d1d-826a-51605c056875

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f70328d8-cebb-4d1d-826a-51605c056875
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f70328d8-cebb-4d1d-826a-51605c056875
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
correlation: qa-1a26d6e1-185c-438f-8b72-1cecc2d6286b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a26d6e1-185c-438f-8b72-1cecc2d6286b
Content-Type: application/json

--- request body ---
{"handle":"qa-05b8fb72e5ac","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1a26d6e1-185c-438f-8b72-1cecc2d6286b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1a26d6e1-185c-438f-8b72-1cecc2d6286b"}
```
