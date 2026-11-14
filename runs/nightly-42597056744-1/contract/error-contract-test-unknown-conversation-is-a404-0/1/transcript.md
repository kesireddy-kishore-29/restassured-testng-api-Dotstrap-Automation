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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-92b534b5-6326-4a88-ade4-c4420dc49bfa` |
| 2 | `POST /v1/auth/token` | 200 | 12 | `qa-babf4dd4-1ffd-4bb5-97c0-0d692b36793c` |
| 3 | `GET /v1/conversations/{id}` | 404 | 8 | `qa-8e8380d1-9322-405e-a6aa-631f41b23b2a` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-d8f71715-5a25-45f5-885a-ab318abbd3c3` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-a90e2f53-2667-4d58-a6a7-9d2b39eb2d83` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-92b534b5-6326-4a88-ade4-c4420dc49bfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92b534b5-6326-4a88-ade4-c4420dc49bfa
Content-Type: application/json

--- request body ---
{"handle":"qa-53267ff0ade6","displayName":"QA 53267ff0ade6","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-92b534b5-6326-4a88-ade4-c4420dc49bfa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 290
RateLimit-Reset: 7
Location: /v1/accounts/qa-53267ff0ade6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f12d315b-4ece-4a0b-bb90-546200966162","handle":"qa-53267ff0ade6","displayName":"QA 53267ff0ade6","region":"eu","role":"user","createdAt":"2026-11-09T09:56:04.162706441Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-babf4dd4-1ffd-4bb5-97c0-0d692b36793c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-babf4dd4-1ffd-4bb5-97c0-0d692b36793c
Content-Type: application/json

--- request body ---
{"handle":"qa-53267ff0ade6","password":"****"}

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-babf4dd4-1ffd-4bb5-97c0-0d692b36793c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f12d315b-4ece-4a0b-bb90-546200966162"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-8e8380d1-9322-405e-a6aa-631f41b23b2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e8380d1-9322-405e-a6aa-631f41b23b2a
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8e8380d1-9322-405e-a6aa-631f41b23b2a
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-8e8380d1-9322-405e-a6aa-631f41b23b2a"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d8f71715-5a25-45f5-885a-ab318abbd3c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8f71715-5a25-45f5-885a-ab318abbd3c3
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d8f71715-5a25-45f5-885a-ab318abbd3c3
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
correlation: qa-a90e2f53-2667-4d58-a6a7-9d2b39eb2d83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a90e2f53-2667-4d58-a6a7-9d2b39eb2d83
Content-Type: application/json

--- request body ---
{"handle":"qa-53267ff0ade6","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a90e2f53-2667-4d58-a6a7-9d2b39eb2d83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a90e2f53-2667-4d58-a6a7-9d2b39eb2d83"}
```
