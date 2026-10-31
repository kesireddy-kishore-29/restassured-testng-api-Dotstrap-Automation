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
| 1 | `POST /v1/accounts` | 201 | 29 | `qa-410375c5-7465-4085-9ae0-e60c84e22284` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-2bc600db-f680-4695-9fae-81049a9e03c2` |
| 3 | `GET /v1/conversations/{id}` | 404 | 39 | `qa-4b62aaee-76c3-4646-b6c0-dba03ebce689` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b50fa034-00b9-4f6d-ab30-c7af2f4ffa0c` |
| 5 | `POST /v1/auth/token` | 401 | 5 | `qa-786d946b-4907-40a9-b008-3ecb879b635e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-410375c5-7465-4085-9ae0-e60c84e22284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-410375c5-7465-4085-9ae0-e60c84e22284
Content-Type: application/json

--- request body ---
{"handle":"qa-ba238fcd5aa1","displayName":"QA ba238fcd5aa1","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-410375c5-7465-4085-9ae0-e60c84e22284
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 287
RateLimit-Reset: 6
Location: /v1/accounts/qa-ba238fcd5aa1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9f4cda33-4739-4ca7-afee-c552b3c8f0c9","handle":"qa-ba238fcd5aa1","displayName":"QA ba238fcd5aa1","region":"eu","role":"user","createdAt":"2026-10-27T08:00:36.181647634Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2bc600db-f680-4695-9fae-81049a9e03c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bc600db-f680-4695-9fae-81049a9e03c2
Content-Type: application/json

--- request body ---
{"handle":"qa-ba238fcd5aa1","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bc600db-f680-4695-9fae-81049a9e03c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 5
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9f4cda33-4739-4ca7-afee-c552b3c8f0c9"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-4b62aaee-76c3-4646-b6c0-dba03ebce689

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b62aaee-76c3-4646-b6c0-dba03ebce689
Content-Type: application/json

--- response: 404 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b62aaee-76c3-4646-b6c0-dba03ebce689
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-4b62aaee-76c3-4646-b6c0-dba03ebce689"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b50fa034-00b9-4f6d-ab30-c7af2f4ffa0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b50fa034-00b9-4f6d-ab30-c7af2f4ffa0c
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b50fa034-00b9-4f6d-ab30-c7af2f4ffa0c
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
correlation: qa-786d946b-4907-40a9-b008-3ecb879b635e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-786d946b-4907-40a9-b008-3ecb879b635e
Content-Type: application/json

--- request body ---
{"handle":"qa-ba238fcd5aa1","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-786d946b-4907-40a9-b008-3ecb879b635e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-786d946b-4907-40a9-b008-3ecb879b635e"}
```
