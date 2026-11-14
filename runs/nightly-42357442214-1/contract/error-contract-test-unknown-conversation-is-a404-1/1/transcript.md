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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-646888f9-3f6f-4e4e-9680-ceb5c9bb71ac` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-5abeaf99-da07-4463-876a-48111f9b811b` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 11 | `qa-eba56753-ab07-4278-9b65-7d529a83e672` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ccb448fb-af0b-4bef-bac4-fa75afd1bbbd` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-6cd54e41-6a09-42b7-8638-764119161435` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-646888f9-3f6f-4e4e-9680-ceb5c9bb71ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-646888f9-3f6f-4e4e-9680-ceb5c9bb71ac
Content-Type: application/json

--- request body ---
{"handle":"qa-063556ff81f4","displayName":"QA 063556ff81f4","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-646888f9-3f6f-4e4e-9680-ceb5c9bb71ac
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
Location: /v1/accounts/qa-063556ff81f4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7002c87-c1da-4428-9893-00a6586f39e8","handle":"qa-063556ff81f4","displayName":"QA 063556ff81f4","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.824388473Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5abeaf99-da07-4463-876a-48111f9b811b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5abeaf99-da07-4463-876a-48111f9b811b
Content-Type: application/json

--- request body ---
{"handle":"qa-063556ff81f4","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-5abeaf99-da07-4463-876a-48111f9b811b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7002c87-c1da-4428-9893-00a6586f39e8"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-eba56753-ab07-4278-9b65-7d529a83e672

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eba56753-ab07-4278-9b65-7d529a83e672
Content-Type: application/json

--- response: 404 in 11 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eba56753-ab07-4278-9b65-7d529a83e672
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-eba56753-ab07-4278-9b65-7d529a83e672"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ccb448fb-af0b-4bef-bac4-fa75afd1bbbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccb448fb-af0b-4bef-bac4-fa75afd1bbbd
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ccb448fb-af0b-4bef-bac4-fa75afd1bbbd
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
correlation: qa-6cd54e41-6a09-42b7-8638-764119161435

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6cd54e41-6a09-42b7-8638-764119161435
Content-Type: application/json

--- request body ---
{"handle":"qa-063556ff81f4","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6cd54e41-6a09-42b7-8638-764119161435
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 273
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6cd54e41-6a09-42b7-8638-764119161435"}
```
