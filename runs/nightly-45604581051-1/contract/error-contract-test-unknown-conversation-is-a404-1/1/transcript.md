# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-b755aa8d-d4a8-4964-a74c-f408fcb92e7e` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-bf035bb7-d75d-4d26-802f-0e56289968ce` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 6 | `qa-1e623e93-eeea-4a52-b9ba-c8bfea0da6ac` |
| 4 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d5ef5308-ad7a-4bc9-9b36-fa2960e45773` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-047a3d7f-e1f2-4244-9c57-de37c171f9aa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b755aa8d-d4a8-4964-a74c-f408fcb92e7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b755aa8d-d4a8-4964-a74c-f408fcb92e7e
Content-Type: application/json

--- request body ---
{"handle":"qa-82c8ffb09f2e","displayName":"QA 82c8ffb09f2e","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-b755aa8d-d4a8-4964-a74c-f408fcb92e7e
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
Location: /v1/accounts/qa-82c8ffb09f2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aab37de5-b639-4c5c-891a-f03bc3ec2087","handle":"qa-82c8ffb09f2e","displayName":"QA 82c8ffb09f2e","region":"eu","role":"user","createdAt":"2026-11-25T11:27:59.843535307Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bf035bb7-d75d-4d26-802f-0e56289968ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf035bb7-d75d-4d26-802f-0e56289968ce
Content-Type: application/json

--- request body ---
{"handle":"qa-82c8ffb09f2e","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf035bb7-d75d-4d26-802f-0e56289968ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 281
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aab37de5-b639-4c5c-891a-f03bc3ec2087"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-1e623e93-eeea-4a52-b9ba-c8bfea0da6ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e623e93-eeea-4a52-b9ba-c8bfea0da6ac
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1e623e93-eeea-4a52-b9ba-c8bfea0da6ac
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-1e623e93-eeea-4a52-b9ba-c8bfea0da6ac"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d5ef5308-ad7a-4bc9-9b36-fa2960e45773

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5ef5308-ad7a-4bc9-9b36-fa2960e45773
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d5ef5308-ad7a-4bc9-9b36-fa2960e45773
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
correlation: qa-047a3d7f-e1f2-4244-9c57-de37c171f9aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-047a3d7f-e1f2-4244-9c57-de37c171f9aa
Content-Type: application/json

--- request body ---
{"handle":"qa-82c8ffb09f2e","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-047a3d7f-e1f2-4244-9c57-de37c171f9aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-047a3d7f-e1f2-4244-9c57-de37c171f9aa"}
```
