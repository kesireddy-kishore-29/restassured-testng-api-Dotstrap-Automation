# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 84 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 316 | `qa-db325ce6-93a1-438c-bbe2-69083e0514d3` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-b8ffca80-c40c-4e60-b142-028891e41aea` |
| 3 | `GET /v1/accounts/me` | 200 | 28 | `qa-b31a5038-bb31-41d8-b56b-827a4ae84e18` |
| 4 | `GET /v1/accounts/me` | 200 | 7 | `qa-35128b52-c7c4-4ebd-9d91-29ae65d6d0a7` |
| 5 | `GET /v1/accounts/me` | 200 | 14 | `qa-6628b3c7-e1c1-4ead-95de-363992e386c5` |
| 6 | `GET /v1/accounts/me` | 200 | 11 | `qa-c2d4a270-4412-4e52-a26b-1f65b1d21369` |
| 7 | `GET /v1/accounts/me` | 200 | 10 | `qa-c326fa6f-6fef-488d-a11a-bba870b62ade` |
| 8 | `GET /v1/accounts/me` | 200 | 11 | `qa-ce56fefe-17ad-4e37-8a2c-02439b7b53ce` |
| 9 | `GET /v1/accounts/me` | 200 | 12 | `qa-cc1e73c7-3e13-495b-bf4d-87baadc83343` |
| 10 | `GET /v1/accounts/me` | 200 | 11 | `qa-9820cc39-1820-423c-874d-349486181b3f` |
| 11 | `GET /v1/accounts/me` | 200 | 11 | `qa-419bbdb3-59ce-412a-819f-386c69b58236` |
| 12 | `GET /v1/accounts/me` | 200 | 7 | `qa-6e014012-55f4-48ae-883d-3e30dc4e24e9` |
| 13 | `GET /v1/accounts/me` | 200 | 4 | `qa-03236b6d-45ed-425c-af2d-09bb485e22ca` |
| 14 | `GET /v1/accounts/me` | 200 | 9 | `qa-28e4c441-2962-4e75-bb64-25b4090b4c5a` |
| 15 | `GET /v1/accounts/me` | 200 | 9 | `qa-eebc22ed-8522-48a7-b75c-9700efebbf98` |
| 16 | `GET /v1/accounts/me` | 200 | 8 | `qa-8e571147-0172-4600-b241-88d24e02c3e8` |
| 17 | `GET /v1/accounts/me` | 200 | 7 | `qa-602342f7-a7a8-4270-9709-81582cbb4fd8` |
| 18 | `GET /v1/accounts/me` | 200 | 4 | `qa-1820d3de-86f7-4a43-8db7-c0bae3676be1` |
| 19 | `GET /v1/accounts/me` | 200 | 3 | `qa-71a08651-b795-4f23-abeb-30ab32816c0b` |
| 20 | `GET /v1/accounts/me` | 200 | 4 | `qa-d68e599e-cd18-492d-9d28-ab39ba476f7f` |
| 21 | `GET /v1/accounts/me` | 200 | 4 | `qa-52fb36e3-def5-4526-a398-e0b8462578d5` |
| 22 | `GET /v1/accounts/me` | 200 | 9 | `qa-5b602381-5f1e-4080-a04a-1bf00f1ac449` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-a708bd67-ff82-4039-9e9a-04e2d3695d51` |
| 24 | `GET /v1/accounts/me` | 200 | 9 | `qa-16e75fde-46aa-4d9a-8405-59ef2109e748` |
| 25 | `GET /v1/accounts/me` | 200 | 5 | `qa-bc618445-abab-4c66-b925-d363c0ab3705` |
| 26 | `GET /v1/accounts/me` | 200 | 10 | `qa-92a8c258-0944-4e8b-96da-f84e3408275b` |
| 27 | `GET /v1/accounts/me` | 200 | 6 | `qa-5203f3e7-d024-4ab3-abf3-580d1e65bf21` |
| 28 | `GET /v1/accounts/me` | 200 | 4 | `qa-87e91c5b-2844-4050-a8c6-a1b1ae5a08b3` |
| 29 | `GET /v1/accounts/me` | 200 | 7 | `qa-83e98baf-bc92-4a56-b3a4-a3e7b6be4676` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-b1667ebc-7334-45bb-8df1-00097aebbc5e` |
| 31 | `GET /v1/accounts/me` | 200 | 7 | `qa-eacf1e2f-f666-443b-a56c-b87e7aa7ee7f` |
| 32 | `GET /v1/accounts/me` | 200 | 6 | `qa-8a268917-5915-47fb-a142-43f524749f16` |
| 33 | `GET /v1/accounts/me` | 200 | 6 | `qa-ab8939a3-d9c1-42bc-8845-3e04fdbce4c1` |
| 34 | `GET /v1/accounts/me` | 200 | 6 | `qa-ece6b81b-7d68-494e-b742-85723483a2fb` |
| 35 | `GET /v1/accounts/me` | 200 | 4 | `qa-5ffdc16b-d429-485d-9934-865eb2326d01` |
| 36 | `GET /v1/accounts/me` | 200 | 5 | `qa-bd2790a0-45e3-4779-ac12-6edf6618a86e` |
| 37 | `GET /v1/accounts/me` | 200 | 4 | `qa-a0256633-4158-448b-b65e-ee2eda041e45` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-5b8e6999-dc3d-40bb-add6-aee08b373933` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-200f79f4-3e4b-428a-9b99-6803a45e97e2` |
| 40 | `GET /v1/accounts/me` | 200 | 12 | `qa-ac636b9d-fda3-4929-a708-8959ac0ae506` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-a7061c7f-38ea-4f91-a8b6-5706c3d4ea76` |
| 42 | `GET /v1/accounts/me` | 200 | 7 | `qa-4c713867-7eb2-437c-95c2-df78a8af0def` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-6eedebc6-dd52-428f-b2fd-3bb22ae1f7de` |
| 44 | `GET /v1/accounts/me` | 200 | 6 | `qa-c135f57b-5335-4b03-9539-fe140ab98428` |
| 45 | `GET /v1/accounts/me` | 200 | 10 | `qa-84291062-e149-4d48-8078-aff8d583b9ae` |
| 46 | `GET /v1/accounts/me` | 200 | 7 | `qa-f6f1ae0d-83a0-4562-89cf-d5194a36e6e0` |
| 47 | `GET /v1/accounts/me` | 200 | 8 | `qa-7ce4b6a2-f7c0-45ea-907a-6ccc19171f67` |
| 48 | `GET /v1/accounts/me` | 200 | 8 | `qa-9c30f98b-a964-4bd1-90a3-bcc8f061021a` |
| 49 | `GET /v1/accounts/me` | 200 | 4 | `qa-7c527ad7-9b29-4f2a-a075-10f797f1c5e2` |
| 50 | `GET /v1/accounts/me` | 200 | 6 | `qa-2dfeb0d9-b2a5-45e0-9754-87c8cdb609eb` |
| 51 | `GET /v1/accounts/me` | 200 | 5 | `qa-10de8b2a-e0ff-4d01-ba3f-bce50779026e` |
| 52 | `GET /v1/accounts/me` | 200 | 8 | `qa-6fe98b2f-835d-46bf-adfc-f3ec2e6bfd80` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-75cd098f-567b-4cf1-ba6e-fc062abd2f90` |
| 54 | `GET /v1/accounts/me` | 200 | 3 | `qa-4f05d6b7-e073-4e71-a3e9-cccc481fd1f9` |
| 55 | `GET /v1/accounts/me` | 200 | 4 | `qa-07d49bb7-9b70-46ed-ab4f-7a82678dafd2` |
| 56 | `GET /v1/accounts/me` | 200 | 2 | `qa-52a8d017-4228-4a56-ad9d-c1de5e3afc9f` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-9081c42c-d55a-4614-8f5f-df77fecc86a8` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-121f0f73-23af-4510-aa41-6add5516358b` |
| 59 | `GET /v1/accounts/me` | 200 | 3 | `qa-27ddb725-4097-437b-9f38-055d9c4b42d2` |
| 60 | `GET /v1/accounts/me` | 200 | 2 | `qa-4e053b20-3fcc-4741-a679-d04d0dcaa585` |
| 61 | `GET /v1/accounts/me` | 200 | 3 | `qa-ed08eb03-a959-4ba8-829c-700b70496760` |
| 62 | `GET /v1/accounts/me` | 200 | 2 | `qa-e4ecdc27-82c3-44ab-aea0-216aa62f6570` |
| 63 | `GET /v1/accounts/me` | 429 | 2 | `qa-7d99e830-5892-4142-b155-170ea6f40bb9` |
| 64 | `GET /v1/accounts/me` | 429 | 3 | `qa-bea0fa31-fc00-4c23-ba78-1c47bbefc9d2` |
| 65 | `GET /v1/accounts/me` | 429 | 4 | `qa-65cb4d56-7da4-4eb9-94e2-3aa6c4545ce5` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-063cefc7-e358-4f7f-b0b1-6f4d41d73edf` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-c5c9cf58-bc00-40ca-a659-51e9fcbd9bcd` |
| 68 | `GET /v1/accounts/me` | 429 | 5 | `qa-3988094f-6d79-4c78-8c74-7e2529b67e7f` |
| 69 | `GET /v1/accounts/me` | 429 | 3 | `qa-b273efb0-7a03-42d1-9731-872a4c58eb92` |
| 70 | `GET /v1/accounts/me` | 429 | 3 | `qa-167ddc53-5839-463a-bb5c-fa794e3f1d16` |
| 71 | `GET /v1/accounts/me` | 429 | 3 | `qa-569daa37-9136-4f0e-9558-dee7867c1dd3` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-2a2cb1e2-1008-435a-8bb2-b816fb91d8cb` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-f34c2469-c715-4d06-b45a-5e721629e99e` |
| 74 | `GET /v1/accounts/me` | 429 | 3 | `qa-5aefddf8-c4f9-4b86-b968-289a2b4435e7` |
| 75 | `GET /v1/accounts/me` | 429 | 3 | `qa-1dc0da83-0a2a-42cf-8f1d-e29c3d0bc542` |
| 76 | `GET /v1/accounts/me` | 429 | 3 | `qa-167c9e4c-d58d-4676-8909-301dd67dba6f` |
| 77 | `GET /v1/accounts/me` | 429 | 3 | `qa-7964c187-9601-4691-9f1c-239ab94591ac` |
| 78 | `GET /v1/accounts/me` | 429 | 3 | `qa-59cb04bf-4624-49ff-90ac-16718d9cb146` |
| 79 | `GET /v1/accounts/me` | 429 | 7 | `qa-db879bd5-fd04-4dc1-877f-ce051ba913a5` |
| 80 | `GET /v1/accounts/me` | 429 | 3 | `qa-6fc67881-d82c-4560-9d0b-c1af00dcf7bf` |
| 81 | `GET /v1/accounts/me` | 429 | 3 | `qa-cd1dca9d-8ce5-42ab-8481-75d6ff755ff9` |
| 82 | `GET /v1/accounts/me` | 200 | 4 | `qa-398dec64-dbe2-4dc4-96e4-e251e300c812` |
| 83 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-bc500133-a86e-4130-8615-9d9898cfa291` |
| 84 | `POST /v1/auth/token` | 401 | 2 | `qa-08ccfcb4-0109-46ec-aac6-9e8d2b1282f8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-db325ce6-93a1-438c-bbe2-69083e0514d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db325ce6-93a1-438c-bbe2-69083e0514d3
Content-Type: application/json

--- request body ---
{"handle":"qa-64046e181aee","displayName":"QA 64046e181aee","password":"****","region":"eu"}

--- response: 201 in 316 ms ---
Date: Mon, 09 Nov 2026 09:55:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-db325ce6-93a1-438c-bbe2-69083e0514d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-64046e181aee
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-b8ffca80-c40c-4e60-b142-028891e41aea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8ffca80-c40c-4e60-b142-028891e41aea
Content-Type: application/json

--- request body ---
{"handle":"qa-64046e181aee","password":"****"}

--- response: 200 in 21 ms ---
Date: Mon, 09 Nov 2026 09:55:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8ffca80-c40c-4e60-b142-028891e41aea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72d1c13c-6107-4752-9ff6-0857ca555203"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b31a5038-bb31-41d8-b56b-827a4ae84e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b31a5038-bb31-41d8-b56b-827a4ae84e18
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:55:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b31a5038-bb31-41d8-b56b-827a4ae84e18
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
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-35128b52-c7c4-4ebd-9d91-29ae65d6d0a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35128b52-c7c4-4ebd-9d91-29ae65d6d0a7
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-35128b52-c7c4-4ebd-9d91-29ae65d6d0a7
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
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-6628b3c7-e1c1-4ead-95de-363992e386c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6628b3c7-e1c1-4ead-95de-363992e386c5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6628b3c7-e1c1-4ead-95de-363992e386c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-c2d4a270-4412-4e52-a26b-1f65b1d21369

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2d4a270-4412-4e52-a26b-1f65b1d21369
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2d4a270-4412-4e52-a26b-1f65b1d21369
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-c326fa6f-6fef-488d-a11a-bba870b62ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c326fa6f-6fef-488d-a11a-bba870b62ade
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c326fa6f-6fef-488d-a11a-bba870b62ade
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce56fefe-17ad-4e37-8a2c-02439b7b53ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce56fefe-17ad-4e37-8a2c-02439b7b53ce
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce56fefe-17ad-4e37-8a2c-02439b7b53ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc1e73c7-3e13-495b-bf4d-87baadc83343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc1e73c7-3e13-495b-bf4d-87baadc83343
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc1e73c7-3e13-495b-bf4d-87baadc83343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-9820cc39-1820-423c-874d-349486181b3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9820cc39-1820-423c-874d-349486181b3f
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9820cc39-1820-423c-874d-349486181b3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-419bbdb3-59ce-412a-819f-386c69b58236

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-419bbdb3-59ce-412a-819f-386c69b58236
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-419bbdb3-59ce-412a-819f-386c69b58236
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e014012-55f4-48ae-883d-3e30dc4e24e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e014012-55f4-48ae-883d-3e30dc4e24e9
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e014012-55f4-48ae-883d-3e30dc4e24e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-03236b6d-45ed-425c-af2d-09bb485e22ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03236b6d-45ed-425c-af2d-09bb485e22ca
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-03236b6d-45ed-425c-af2d-09bb485e22ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-28e4c441-2962-4e75-bb64-25b4090b4c5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28e4c441-2962-4e75-bb64-25b4090b4c5a
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-28e4c441-2962-4e75-bb64-25b4090b4c5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-eebc22ed-8522-48a7-b75c-9700efebbf98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eebc22ed-8522-48a7-b75c-9700efebbf98
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-eebc22ed-8522-48a7-b75c-9700efebbf98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e571147-0172-4600-b241-88d24e02c3e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e571147-0172-4600-b241-88d24e02c3e8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e571147-0172-4600-b241-88d24e02c3e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-602342f7-a7a8-4270-9709-81582cbb4fd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-602342f7-a7a8-4270-9709-81582cbb4fd8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-602342f7-a7a8-4270-9709-81582cbb4fd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-1820d3de-86f7-4a43-8db7-c0bae3676be1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1820d3de-86f7-4a43-8db7-c0bae3676be1
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-1820d3de-86f7-4a43-8db7-c0bae3676be1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-71a08651-b795-4f23-abeb-30ab32816c0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71a08651-b795-4f23-abeb-30ab32816c0b
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-71a08651-b795-4f23-abeb-30ab32816c0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-d68e599e-cd18-492d-9d28-ab39ba476f7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d68e599e-cd18-492d-9d28-ab39ba476f7f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d68e599e-cd18-492d-9d28-ab39ba476f7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-52fb36e3-def5-4526-a398-e0b8462578d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52fb36e3-def5-4526-a398-e0b8462578d5
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-52fb36e3-def5-4526-a398-e0b8462578d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b602381-5f1e-4080-a04a-1bf00f1ac449

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b602381-5f1e-4080-a04a-1bf00f1ac449
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b602381-5f1e-4080-a04a-1bf00f1ac449
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-a708bd67-ff82-4039-9e9a-04e2d3695d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a708bd67-ff82-4039-9e9a-04e2d3695d51
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a708bd67-ff82-4039-9e9a-04e2d3695d51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-16e75fde-46aa-4d9a-8405-59ef2109e748

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16e75fde-46aa-4d9a-8405-59ef2109e748
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-16e75fde-46aa-4d9a-8405-59ef2109e748
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc618445-abab-4c66-b925-d363c0ab3705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc618445-abab-4c66-b925-d363c0ab3705
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc618445-abab-4c66-b925-d363c0ab3705
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-92a8c258-0944-4e8b-96da-f84e3408275b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92a8c258-0944-4e8b-96da-f84e3408275b
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-92a8c258-0944-4e8b-96da-f84e3408275b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-5203f3e7-d024-4ab3-abf3-580d1e65bf21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5203f3e7-d024-4ab3-abf3-580d1e65bf21
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5203f3e7-d024-4ab3-abf3-580d1e65bf21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-87e91c5b-2844-4050-a8c6-a1b1ae5a08b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87e91c5b-2844-4050-a8c6-a1b1ae5a08b3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-87e91c5b-2844-4050-a8c6-a1b1ae5a08b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-83e98baf-bc92-4a56-b3a4-a3e7b6be4676

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83e98baf-bc92-4a56-b3a4-a3e7b6be4676
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-83e98baf-bc92-4a56-b3a4-a3e7b6be4676
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1667ebc-7334-45bb-8df1-00097aebbc5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1667ebc-7334-45bb-8df1-00097aebbc5e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1667ebc-7334-45bb-8df1-00097aebbc5e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-eacf1e2f-f666-443b-a56c-b87e7aa7ee7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eacf1e2f-f666-443b-a56c-b87e7aa7ee7f
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-eacf1e2f-f666-443b-a56c-b87e7aa7ee7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-8a268917-5915-47fb-a142-43f524749f16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8a268917-5915-47fb-a142-43f524749f16
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8a268917-5915-47fb-a142-43f524749f16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab8939a3-d9c1-42bc-8845-3e04fdbce4c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab8939a3-d9c1-42bc-8845-3e04fdbce4c1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab8939a3-d9c1-42bc-8845-3e04fdbce4c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-ece6b81b-7d68-494e-b742-85723483a2fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ece6b81b-7d68-494e-b742-85723483a2fb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ece6b81b-7d68-494e-b742-85723483a2fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-5ffdc16b-d429-485d-9934-865eb2326d01

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5ffdc16b-d429-485d-9934-865eb2326d01
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ffdc16b-d429-485d-9934-865eb2326d01
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-bd2790a0-45e3-4779-ac12-6edf6618a86e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd2790a0-45e3-4779-ac12-6edf6618a86e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd2790a0-45e3-4779-ac12-6edf6618a86e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-a0256633-4158-448b-b65e-ee2eda041e45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0256633-4158-448b-b65e-ee2eda041e45
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0256633-4158-448b-b65e-ee2eda041e45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b8e6999-dc3d-40bb-add6-aee08b373933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b8e6999-dc3d-40bb-add6-aee08b373933
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b8e6999-dc3d-40bb-add6-aee08b373933
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-200f79f4-3e4b-428a-9b99-6803a45e97e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-200f79f4-3e4b-428a-9b99-6803a45e97e2
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-200f79f4-3e4b-428a-9b99-6803a45e97e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac636b9d-fda3-4929-a708-8959ac0ae506

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac636b9d-fda3-4929-a708-8959ac0ae506
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac636b9d-fda3-4929-a708-8959ac0ae506
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7061c7f-38ea-4f91-a8b6-5706c3d4ea76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7061c7f-38ea-4f91-a8b6-5706c3d4ea76
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7061c7f-38ea-4f91-a8b6-5706c3d4ea76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c713867-7eb2-437c-95c2-df78a8af0def

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c713867-7eb2-437c-95c2-df78a8af0def
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c713867-7eb2-437c-95c2-df78a8af0def
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-6eedebc6-dd52-428f-b2fd-3bb22ae1f7de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eedebc6-dd52-428f-b2fd-3bb22ae1f7de
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6eedebc6-dd52-428f-b2fd-3bb22ae1f7de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-c135f57b-5335-4b03-9539-fe140ab98428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c135f57b-5335-4b03-9539-fe140ab98428
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c135f57b-5335-4b03-9539-fe140ab98428
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-84291062-e149-4d48-8078-aff8d583b9ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84291062-e149-4d48-8078-aff8d583b9ae
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-84291062-e149-4d48-8078-aff8d583b9ae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-f6f1ae0d-83a0-4562-89cf-d5194a36e6e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6f1ae0d-83a0-4562-89cf-d5194a36e6e0
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6f1ae0d-83a0-4562-89cf-d5194a36e6e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ce4b6a2-f7c0-45ea-907a-6ccc19171f67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ce4b6a2-f7c0-45ea-907a-6ccc19171f67
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ce4b6a2-f7c0-45ea-907a-6ccc19171f67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c30f98b-a964-4bd1-90a3-bcc8f061021a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c30f98b-a964-4bd1-90a3-bcc8f061021a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c30f98b-a964-4bd1-90a3-bcc8f061021a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c527ad7-9b29-4f2a-a075-10f797f1c5e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c527ad7-9b29-4f2a-a075-10f797f1c5e2
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c527ad7-9b29-4f2a-a075-10f797f1c5e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-2dfeb0d9-b2a5-45e0-9754-87c8cdb609eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dfeb0d9-b2a5-45e0-9754-87c8cdb609eb
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2dfeb0d9-b2a5-45e0-9754-87c8cdb609eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-10de8b2a-e0ff-4d01-ba3f-bce50779026e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10de8b2a-e0ff-4d01-ba3f-bce50779026e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-10de8b2a-e0ff-4d01-ba3f-bce50779026e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-6fe98b2f-835d-46bf-adfc-f3ec2e6bfd80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fe98b2f-835d-46bf-adfc-f3ec2e6bfd80
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fe98b2f-835d-46bf-adfc-f3ec2e6bfd80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-75cd098f-567b-4cf1-ba6e-fc062abd2f90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75cd098f-567b-4cf1-ba6e-fc062abd2f90
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-75cd098f-567b-4cf1-ba6e-fc062abd2f90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-4f05d6b7-e073-4e71-a3e9-cccc481fd1f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f05d6b7-e073-4e71-a3e9-cccc481fd1f9
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f05d6b7-e073-4e71-a3e9-cccc481fd1f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-07d49bb7-9b70-46ed-ab4f-7a82678dafd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07d49bb7-9b70-46ed-ab4f-7a82678dafd2
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-07d49bb7-9b70-46ed-ab4f-7a82678dafd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-52a8d017-4228-4a56-ad9d-c1de5e3afc9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52a8d017-4228-4a56-ad9d-c1de5e3afc9f
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-52a8d017-4228-4a56-ad9d-c1de5e3afc9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-9081c42c-d55a-4614-8f5f-df77fecc86a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9081c42c-d55a-4614-8f5f-df77fecc86a8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9081c42c-d55a-4614-8f5f-df77fecc86a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-121f0f73-23af-4510-aa41-6add5516358b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-121f0f73-23af-4510-aa41-6add5516358b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-121f0f73-23af-4510-aa41-6add5516358b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-27ddb725-4097-437b-9f38-055d9c4b42d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27ddb725-4097-437b-9f38-055d9c4b42d2
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-27ddb725-4097-437b-9f38-055d9c4b42d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e053b20-3fcc-4741-a679-d04d0dcaa585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e053b20-3fcc-4741-a679-d04d0dcaa585
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e053b20-3fcc-4741-a679-d04d0dcaa585
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-ed08eb03-a959-4ba8-829c-700b70496760

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed08eb03-a959-4ba8-829c-700b70496760
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed08eb03-a959-4ba8-829c-700b70496760
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4ecdc27-82c3-44ab-aea0-216aa62f6570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4ecdc27-82c3-44ab-aea0-216aa62f6570
Content-Type: application/json

--- response: 200 in 2 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4ecdc27-82c3-44ab-aea0-216aa62f6570
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d99e830-5892-4142-b155-170ea6f40bb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d99e830-5892-4142-b155-170ea6f40bb9
Content-Type: application/json

--- response: 429 in 2 ms ---
Date: Mon, 09 Nov 2026 09:55:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d99e830-5892-4142-b155-170ea6f40bb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 10
Retry-After: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 10 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7d99e830-5892-4142-b155-170ea6f40bb9"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-bea0fa31-fc00-4c23-ba78-1c47bbefc9d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea0fa31-fc00-4c23-ba78-1c47bbefc9d2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bea0fa31-fc00-4c23-ba78-1c47bbefc9d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-bea0fa31-fc00-4c23-ba78-1c47bbefc9d2"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-65cb4d56-7da4-4eb9-94e2-3aa6c4545ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65cb4d56-7da4-4eb9-94e2-3aa6c4545ce5
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65cb4d56-7da4-4eb9-94e2-3aa6c4545ce5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-65cb4d56-7da4-4eb9-94e2-3aa6c4545ce5"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-063cefc7-e358-4f7f-b0b1-6f4d41d73edf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-063cefc7-e358-4f7f-b0b1-6f4d41d73edf
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-063cefc7-e358-4f7f-b0b1-6f4d41d73edf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-063cefc7-e358-4f7f-b0b1-6f4d41d73edf"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5c9cf58-bc00-40ca-a659-51e9fcbd9bcd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5c9cf58-bc00-40ca-a659-51e9fcbd9bcd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c5c9cf58-bc00-40ca-a659-51e9fcbd9bcd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c5c9cf58-bc00-40ca-a659-51e9fcbd9bcd"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-3988094f-6d79-4c78-8c74-7e2529b67e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3988094f-6d79-4c78-8c74-7e2529b67e7f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3988094f-6d79-4c78-8c74-7e2529b67e7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3988094f-6d79-4c78-8c74-7e2529b67e7f"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-b273efb0-7a03-42d1-9731-872a4c58eb92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b273efb0-7a03-42d1-9731-872a4c58eb92
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b273efb0-7a03-42d1-9731-872a4c58eb92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b273efb0-7a03-42d1-9731-872a4c58eb92"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-167ddc53-5839-463a-bb5c-fa794e3f1d16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167ddc53-5839-463a-bb5c-fa794e3f1d16
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-167ddc53-5839-463a-bb5c-fa794e3f1d16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-167ddc53-5839-463a-bb5c-fa794e3f1d16"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-569daa37-9136-4f0e-9558-dee7867c1dd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-569daa37-9136-4f0e-9558-dee7867c1dd3
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-569daa37-9136-4f0e-9558-dee7867c1dd3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-569daa37-9136-4f0e-9558-dee7867c1dd3"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-2a2cb1e2-1008-435a-8bb2-b816fb91d8cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a2cb1e2-1008-435a-8bb2-b816fb91d8cb
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2a2cb1e2-1008-435a-8bb2-b816fb91d8cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2a2cb1e2-1008-435a-8bb2-b816fb91d8cb"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-f34c2469-c715-4d06-b45a-5e721629e99e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f34c2469-c715-4d06-b45a-5e721629e99e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f34c2469-c715-4d06-b45a-5e721629e99e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f34c2469-c715-4d06-b45a-5e721629e99e"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-5aefddf8-c4f9-4b86-b968-289a2b4435e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aefddf8-c4f9-4b86-b968-289a2b4435e7
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5aefddf8-c4f9-4b86-b968-289a2b4435e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5aefddf8-c4f9-4b86-b968-289a2b4435e7"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-1dc0da83-0a2a-42cf-8f1d-e29c3d0bc542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dc0da83-0a2a-42cf-8f1d-e29c3d0bc542
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1dc0da83-0a2a-42cf-8f1d-e29c3d0bc542
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1dc0da83-0a2a-42cf-8f1d-e29c3d0bc542"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-167c9e4c-d58d-4676-8909-301dd67dba6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-167c9e4c-d58d-4676-8909-301dd67dba6f
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-167c9e4c-d58d-4676-8909-301dd67dba6f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-167c9e4c-d58d-4676-8909-301dd67dba6f"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-7964c187-9601-4691-9f1c-239ab94591ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7964c187-9601-4691-9f1c-239ab94591ac
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7964c187-9601-4691-9f1c-239ab94591ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7964c187-9601-4691-9f1c-239ab94591ac"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-59cb04bf-4624-49ff-90ac-16718d9cb146

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59cb04bf-4624-49ff-90ac-16718d9cb146
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59cb04bf-4624-49ff-90ac-16718d9cb146
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-59cb04bf-4624-49ff-90ac-16718d9cb146"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-db879bd5-fd04-4dc1-877f-ce051ba913a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db879bd5-fd04-4dc1-877f-ce051ba913a5
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Mon, 09 Nov 2026 09:56:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db879bd5-fd04-4dc1-877f-ce051ba913a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-db879bd5-fd04-4dc1-877f-ce051ba913a5"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-6fc67881-d82c-4560-9d0b-c1af00dcf7bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fc67881-d82c-4560-9d0b-c1af00dcf7bf
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fc67881-d82c-4560-9d0b-c1af00dcf7bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6fc67881-d82c-4560-9d0b-c1af00dcf7bf"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd1dca9d-8ce5-42ab-8481-75d6ff755ff9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd1dca9d-8ce5-42ab-8481-75d6ff755ff9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cd1dca9d-8ce5-42ab-8481-75d6ff755ff9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cd1dca9d-8ce5-42ab-8481-75d6ff755ff9"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-398dec64-dbe2-4dc4-96e4-e251e300c812

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-398dec64-dbe2-4dc4-96e4-e251e300c812
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-398dec64-dbe2-4dc4-96e4-e251e300c812
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
Content-Length: 181

{"id":"acc_72d1c13c-6107-4752-9ff6-0857ca555203","handle":"qa-64046e181aee","displayName":"QA 64046e181aee","region":"eu","role":"user","createdAt":"2026-11-09T09:55:52.667924124Z"}
```

## 83. DELETE /v1/accounts/me

```text
#83 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bc500133-a86e-4130-8615-9d9898cfa291

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc500133-a86e-4130-8615-9d9898cfa291
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bc500133-a86e-4130-8615-9d9898cfa291
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

## 84. POST /v1/auth/token

```text
#84 POST http://localhost:7070/v1/auth/token
correlation: qa-08ccfcb4-0109-46ec-aac6-9e8d2b1282f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08ccfcb4-0109-46ec-aac6-9e8d2b1282f8
Content-Type: application/json

--- request body ---
{"handle":"qa-64046e181aee","password":"****"}

--- response: 401 in 2 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08ccfcb4-0109-46ec-aac6-9e8d2b1282f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-08ccfcb4-0109-46ec-aac6-9e8d2b1282f8"}
```
