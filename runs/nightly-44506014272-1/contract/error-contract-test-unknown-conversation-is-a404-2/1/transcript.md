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
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-5073587b-89a9-4819-b6e1-96fdcfc2711b` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-378aeb53-f665-4ebc-adab-0cf769864b33` |
| 3 | `POST /v1/conversations/{id}/messages` | 404 | 14 | `qa-8b3f7ef2-c67b-4302-a32e-1cf6377a6360` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-cd75795e-f3b2-48b5-be94-863cadfeaa8d` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-98c08057-af33-4aa8-8ef4-48b7a37afc8c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5073587b-89a9-4819-b6e1-96fdcfc2711b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5073587b-89a9-4819-b6e1-96fdcfc2711b
Content-Type: application/json

--- request body ---
{"handle":"qa-57a2e897fe30","displayName":"QA 57a2e897fe30","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-5073587b-89a9-4819-b6e1-96fdcfc2711b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 289
RateLimit-Reset: 5
Location: /v1/accounts/qa-57a2e897fe30
X-Served-Region: eu
Content-Length: 181

{"id":"acc_146f7048-73c3-481e-a8d0-f06c17f8b726","handle":"qa-57a2e897fe30","displayName":"QA 57a2e897fe30","region":"eu","role":"user","createdAt":"2026-11-19T10:29:27.901247959Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-378aeb53-f665-4ebc-adab-0cf769864b33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-378aeb53-f665-4ebc-adab-0cf769864b33
Content-Type: application/json

--- request body ---
{"handle":"qa-57a2e897fe30","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-378aeb53-f665-4ebc-adab-0cf769864b33
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_146f7048-73c3-481e-a8d0-f06c17f8b726"}
```

## 3. POST /v1/conversations/{id}/messages

```text
#3 POST http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-8b3f7ef2-c67b-4302-a32e-1cf6377a6360

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b3f7ef2-c67b-4302-a32e-1cf6377a6360
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 404 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b3f7ef2-c67b-4302-a32e-1cf6377a6360
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-8b3f7ef2-c67b-4302-a32e-1cf6377a6360"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cd75795e-f3b2-48b5-be94-863cadfeaa8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd75795e-f3b2-48b5-be94-863cadfeaa8d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cd75795e-f3b2-48b5-be94-863cadfeaa8d
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
correlation: qa-98c08057-af33-4aa8-8ef4-48b7a37afc8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98c08057-af33-4aa8-8ef4-48b7a37afc8c
Content-Type: application/json

--- request body ---
{"handle":"qa-57a2e897fe30","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-98c08057-af33-4aa8-8ef4-48b7a37afc8c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 279
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-98c08057-af33-4aa8-8ef4-48b7a37afc8c"}
```
