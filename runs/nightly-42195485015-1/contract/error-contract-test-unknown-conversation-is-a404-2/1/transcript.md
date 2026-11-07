# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-b9f3eb4a-ddc6-4fbd-8e99-8c6481ba6146` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-093a4b04-bf86-4376-afa3-27ef2f86929a` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 19 | `qa-91e4d4ee-39cb-4660-b86d-ecedfd7b74c5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-002371e7-d462-47b6-b12b-e3ee6fc14c3b` |
| 5 | `POST /v1/auth/token` | 401 | 19 | `qa-508b3577-b847-4f6a-94fc-8bedb8da5dc1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b9f3eb4a-ddc6-4fbd-8e99-8c6481ba6146

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9f3eb4a-ddc6-4fbd-8e99-8c6481ba6146
Content-Type: application/json

--- request body ---
{"handle":"qa-ef5988cc289e","displayName":"QA ef5988cc289e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9f3eb4a-ddc6-4fbd-8e99-8c6481ba6146
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 286
RateLimit-Reset: 5
Location: /v1/accounts/qa-ef5988cc289e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f6d4240-2cc0-4c5e-b3f9-e55e32f4c268","handle":"qa-ef5988cc289e","displayName":"QA ef5988cc289e","region":"eu","role":"user","createdAt":"2026-11-06T09:30:35.163627869Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-093a4b04-bf86-4376-afa3-27ef2f86929a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-093a4b04-bf86-4376-afa3-27ef2f86929a
Content-Type: application/json

--- request body ---
{"handle":"qa-ef5988cc289e","password":"****"}

--- response: 200 in 34 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-093a4b04-bf86-4376-afa3-27ef2f86929a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 283
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f6d4240-2cc0-4c5e-b3f9-e55e32f4c268"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-91e4d4ee-39cb-4660-b86d-ecedfd7b74c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91e4d4ee-39cb-4660-b86d-ecedfd7b74c5
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-91e4d4ee-39cb-4660-b86d-ecedfd7b74c5
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-91e4d4ee-39cb-4660-b86d-ecedfd7b74c5"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-002371e7-d462-47b6-b12b-e3ee6fc14c3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-002371e7-d462-47b6-b12b-e3ee6fc14c3b
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-002371e7-d462-47b6-b12b-e3ee6fc14c3b
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
correlation: qa-508b3577-b847-4f6a-94fc-8bedb8da5dc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-508b3577-b847-4f6a-94fc-8bedb8da5dc1
Content-Type: application/json

--- request body ---
{"handle":"qa-ef5988cc289e","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-508b3577-b847-4f6a-94fc-8bedb8da5dc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 274
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-508b3577-b847-4f6a-94fc-8bedb8da5dc1"}
```
