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
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-bec09ee0-78d2-4c1f-92c6-1d90d12949a1` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-4ae92773-0cb2-44a5-bd9a-0b80692eb1ec` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 16 | `qa-d5444f15-14be-4bec-a668-32726023c650` |
| 4 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-977eeeb4-8d2c-41ff-b546-ca7f19b0f812` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-989e5cb6-c068-49c7-9068-6896ba712202` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bec09ee0-78d2-4c1f-92c6-1d90d12949a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bec09ee0-78d2-4c1f-92c6-1d90d12949a1
Content-Type: application/json

--- request body ---
{"handle":"qa-ce755b8d2e91","displayName":"QA ce755b8d2e91","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bec09ee0-78d2-4c1f-92c6-1d90d12949a1
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
Location: /v1/accounts/qa-ce755b8d2e91
X-Served-Region: eu
Content-Length: 181

{"id":"acc_765d21ca-7368-4cc5-a35c-c7ee2bc0dd78","handle":"qa-ce755b8d2e91","displayName":"QA ce755b8d2e91","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.276427528Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4ae92773-0cb2-44a5-bd9a-0b80692eb1ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ae92773-0cb2-44a5-bd9a-0b80692eb1ec
Content-Type: application/json

--- request body ---
{"handle":"qa-ce755b8d2e91","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ae92773-0cb2-44a5-bd9a-0b80692eb1ec
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_765d21ca-7368-4cc5-a35c-c7ee2bc0dd78"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-d5444f15-14be-4bec-a668-32726023c650

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5444f15-14be-4bec-a668-32726023c650
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d5444f15-14be-4bec-a668-32726023c650
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-d5444f15-14be-4bec-a668-32726023c650"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-977eeeb4-8d2c-41ff-b546-ca7f19b0f812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-977eeeb4-8d2c-41ff-b546-ca7f19b0f812
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-977eeeb4-8d2c-41ff-b546-ca7f19b0f812
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
correlation: qa-989e5cb6-c068-49c7-9068-6896ba712202

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-989e5cb6-c068-49c7-9068-6896ba712202
Content-Type: application/json

--- request body ---
{"handle":"qa-ce755b8d2e91","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-989e5cb6-c068-49c7-9068-6896ba712202
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-989e5cb6-c068-49c7-9068-6896ba712202"}
```
