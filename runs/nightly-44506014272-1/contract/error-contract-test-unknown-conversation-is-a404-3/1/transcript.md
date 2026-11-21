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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-bf348344-ff2f-45e9-a0e2-47093ed5815d` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-a520592f-84aa-434b-917b-7d696b2372a3` |
| 3 | `POST /v1/conversations/{id}/read` | 404 | 28 | `qa-a7cf5159-ba60-4055-9413-0566e551c1f6` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6e619dfd-0f34-4fa4-b98c-63cf0dd47108` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-5550888f-185e-442c-a0d7-a0bf86f7eed9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bf348344-ff2f-45e9-a0e2-47093ed5815d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf348344-ff2f-45e9-a0e2-47093ed5815d
Content-Type: application/json

--- request body ---
{"handle":"qa-ca2a9baf47d1","displayName":"QA ca2a9baf47d1","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf348344-ff2f-45e9-a0e2-47093ed5815d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 5
Location: /v1/accounts/qa-ca2a9baf47d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b32b6e2b-6535-44eb-a8e7-db1eec12013f","handle":"qa-ca2a9baf47d1","displayName":"QA ca2a9baf47d1","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.913572807Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-a520592f-84aa-434b-917b-7d696b2372a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a520592f-84aa-434b-917b-7d696b2372a3
Content-Type: application/json

--- request body ---
{"handle":"qa-ca2a9baf47d1","password":"****"}

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a520592f-84aa-434b-917b-7d696b2372a3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 284
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b32b6e2b-6535-44eb-a8e7-db1eec12013f"}
```

## 3. POST /v1/conversations/{id}/read

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/read
correlation: qa-a7cf5159-ba60-4055-9413-0566e551c1f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7cf5159-ba60-4055-9413-0566e551c1f6
Content-Type: application/json

--- response: 404 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7cf5159-ba60-4055-9413-0566e551c1f6
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/read","correlationId":"qa-a7cf5159-ba60-4055-9413-0566e551c1f6"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6e619dfd-0f34-4fa4-b98c-63cf0dd47108

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e619dfd-0f34-4fa4-b98c-63cf0dd47108
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6e619dfd-0f34-4fa4-b98c-63cf0dd47108
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
correlation: qa-5550888f-185e-442c-a0d7-a0bf86f7eed9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5550888f-185e-442c-a0d7-a0bf86f7eed9
Content-Type: application/json

--- request body ---
{"handle":"qa-ca2a9baf47d1","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5550888f-185e-442c-a0d7-a0bf86f7eed9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5550888f-185e-442c-a0d7-a0bf86f7eed9"}
```
