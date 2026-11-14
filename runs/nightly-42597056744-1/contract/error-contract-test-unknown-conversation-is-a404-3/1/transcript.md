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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-29692bd8-008a-4152-9d05-ab95abe9a1ab` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-717856dd-0bfe-449b-a661-eda24f4e1d78` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 8 | `qa-061a73d8-ea81-47c2-b35e-9e8ad6111054` |
| 4 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-2b837525-bed2-4933-9c9e-976ddbc039d2` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-395680e1-0bde-4f51-ab0f-77694ef91379` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-29692bd8-008a-4152-9d05-ab95abe9a1ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29692bd8-008a-4152-9d05-ab95abe9a1ab
Content-Type: application/json

--- request body ---
{"handle":"qa-49cf8afd9e40","displayName":"QA 49cf8afd9e40","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-29692bd8-008a-4152-9d05-ab95abe9a1ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 7
Location: /v1/accounts/qa-49cf8afd9e40
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4cb37356-c716-4544-b70a-a8983d38e616","handle":"qa-49cf8afd9e40","displayName":"QA 49cf8afd9e40","region":"eu","role":"user","createdAt":"2026-11-09T09:56:04.161852680Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-717856dd-0bfe-449b-a661-eda24f4e1d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-717856dd-0bfe-449b-a661-eda24f4e1d78
Content-Type: application/json

--- request body ---
{"handle":"qa-49cf8afd9e40","password":"****"}

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-717856dd-0bfe-449b-a661-eda24f4e1d78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4cb37356-c716-4544-b70a-a8983d38e616"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-061a73d8-ea81-47c2-b35e-9e8ad6111054

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-061a73d8-ea81-47c2-b35e-9e8ad6111054
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-061a73d8-ea81-47c2-b35e-9e8ad6111054
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-061a73d8-ea81-47c2-b35e-9e8ad6111054"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b837525-bed2-4933-9c9e-976ddbc039d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b837525-bed2-4933-9c9e-976ddbc039d2
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b837525-bed2-4933-9c9e-976ddbc039d2
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
correlation: qa-395680e1-0bde-4f51-ab0f-77694ef91379

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-395680e1-0bde-4f51-ab0f-77694ef91379
Content-Type: application/json

--- request body ---
{"handle":"qa-49cf8afd9e40","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-395680e1-0bde-4f51-ab0f-77694ef91379
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 280
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-395680e1-0bde-4f51-ab0f-77694ef91379"}
```
