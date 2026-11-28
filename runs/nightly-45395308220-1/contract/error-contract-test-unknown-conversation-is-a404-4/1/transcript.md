# Transcript: Every conversation operation answers an unknown id with a 404 problem [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-322c5229-5e80-4595-8dec-641b314f3df3` |
| 2 | `POST /v1/auth/token` | 200 | 14 | `qa-80f968f1-f2d7-4d36-a1b7-66cd5b4e25bb` |
| 3 | `POST /v1/conversations/{id}/close` | 404 | 10 | `qa-ea53fc58-96b0-4e17-8cbc-7dbdd8dfb9e5` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0b1c5647-42f7-42ec-818c-2dc55d5ff61c` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-c7cd725b-5510-4f07-8465-d080c85bbf26` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-322c5229-5e80-4595-8dec-641b314f3df3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-322c5229-5e80-4595-8dec-641b314f3df3
Content-Type: application/json

--- request body ---
{"handle":"qa-5666ca62d8ad","displayName":"QA 5666ca62d8ad","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-322c5229-5e80-4595-8dec-641b314f3df3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 275
RateLimit-Reset: 6
Location: /v1/accounts/qa-5666ca62d8ad
X-Served-Region: eu
Content-Length: 181

{"id":"acc_dcebca57-ce42-4dda-8703-b7599109e1c7","handle":"qa-5666ca62d8ad","displayName":"QA 5666ca62d8ad","region":"eu","role":"user","createdAt":"2026-11-24T12:38:16.254905573Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-80f968f1-f2d7-4d36-a1b7-66cd5b4e25bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80f968f1-f2d7-4d36-a1b7-66cd5b4e25bb
Content-Type: application/json

--- request body ---
{"handle":"qa-5666ca62d8ad","password":"****"}

--- response: 200 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-80f968f1-f2d7-4d36-a1b7-66cd5b4e25bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 272
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dcebca57-ce42-4dda-8703-b7599109e1c7"}
```

## 3. POST /v1/conversations/{id}/close

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/close
correlation: qa-ea53fc58-96b0-4e17-8cbc-7dbdd8dfb9e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea53fc58-96b0-4e17-8cbc-7dbdd8dfb9e5
Content-Type: application/json

--- response: 404 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ea53fc58-96b0-4e17-8cbc-7dbdd8dfb9e5
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
Content-Length: 259

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/close","correlationId":"qa-ea53fc58-96b0-4e17-8cbc-7dbdd8dfb9e5"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0b1c5647-42f7-42ec-818c-2dc55d5ff61c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b1c5647-42f7-42ec-818c-2dc55d5ff61c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0b1c5647-42f7-42ec-818c-2dc55d5ff61c
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
correlation: qa-c7cd725b-5510-4f07-8465-d080c85bbf26

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7cd725b-5510-4f07-8465-d080c85bbf26
Content-Type: application/json

--- request body ---
{"handle":"qa-5666ca62d8ad","password":"****"}

--- response: 401 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7cd725b-5510-4f07-8465-d080c85bbf26
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 271
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7cd725b-5510-4f07-8465-d080c85bbf26"}
```
